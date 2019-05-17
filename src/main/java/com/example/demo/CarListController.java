package com.example.demo;

import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@org.springframework.stereotype.Controller

public class CarListController implements Controller {
    @RequestMapping(value="/carList.htm", method= RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest arg0,
                                      HttpServletResponse arg1) throws Exception {
        Car car1 = new Car();
        car1.setId((long)1);
        car1.setBrand("Mercedes");
        car1.setModel("SL 500");
        car1.setPrice(new BigDecimal(40000));

        Car car2 = new Car();
        car2.setId((long)2);
        car2.setBrand("Peugeot");
        car2.setModel("607");
        car2.setPrice(new BigDecimal(35000));

        Car car3 = new Car();
        car3.setId((long)3);
        car3.setBrand("Lada-Kalina");
        car3.setModel("TA-123");
        car3.setPrice(new BigDecimal(85000));

        Car car4 = new Car();
        car4.setId((long)4);
        car4.setBrand("Mercedes");
        car4.setModel("Info-5");
        car4.setPrice(new BigDecimal(50000));

        Car car5 = new Car();
        car5.setId((long)5);
        car5.setBrand("Samoilova_BENS");
        car5.setModel("Ku-Ku-123");
        car5.setPrice(new BigDecimal(993000));

        List<Car> mycarList = new LinkedList<Car>();
        mycarList.add(car1);
        mycarList.add(car2);
        mycarList.add(car3);
        mycarList.add(car4);
        mycarList.add(car5);

        ModelAndView modelAndView = new ModelAndView("carList");//Имя страницы, которая принимает данные
        modelAndView.addObject("carList", mycarList);

        return modelAndView;
    }
}

