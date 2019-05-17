package com.example.demo;

import com.example.demo.model.Bank;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

@Controller
@SpringBootApplication
public class Main {

	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}
	@RequestMapping("/db")
	String db(Map<String, Object> model) {
		try (Connection connection = dataSource.getConnection()) {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
			stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
			ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

			ArrayList<String> output = new ArrayList<String>();
			while (rs.next()) {
				output.add("Read from DB: " + rs.getTimestamp("tick"));
			}

			model.put("records", output);
			return "db";
		} catch (Exception e) {
			model.put("message", e.getMessage());
			return "error";
		}
	}

	@RequestMapping(value="/bank.htm", method= RequestMethod.GET)

	public ModelAndView my_method(@RequestParam(value = "x", defaultValue= "0") int x,
								  ModelMap model) throws ClassNotFoundException, SQLException {
		try (Connection c = dataSource.getConnection()) {
		ResultSet rs = c.createStatement().executeQuery( "SELECT * FROM public.\"Bank\" WHERE \"Dolg\">="+x );
		ArrayList<Bank> My_Bank = new ArrayList<Bank>();
		while (rs.next()){
			Bank bank = new Bank();
			bank.setId(rs.getInt("Id"));
			bank.setPerson(rs.getString("Person"));
			bank.setDolg(rs.getDouble("Dolg"));
			bank.setPlatit(rs.getBoolean("Platit"));
			bank.setPhone(rs.getString("Phone"));
			My_Bank.add(bank);
		}
		rs.close();
		c.close();
		Comparator<Bank> comparator = Comparator.comparing(obj -> obj.getPerson());
		Collections.sort(My_Bank, comparator);
		// Помещение результатов в параметр запроса
		ModelAndView m = new ModelAndView("bank");//Имя страницы, которая принимает данные
		m.addObject("bank", My_Bank); //carManager.getCarList());
		return m;
		} catch (Exception e) {
			model.put("message", e.getMessage());
			ModelAndView ms = new ModelAndView("bank");
			return ms;
		}
	}


	@Bean
	public DataSource dataSource() throws SQLException {
		if (dbUrl == null || dbUrl.isEmpty()) {
			return new HikariDataSource();
		} else {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(dbUrl);
			return new HikariDataSource(config);
		}
	}

}
