package com.example.demo;

import com.example.demo.model.Bank;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class BankXMLController implements Controller {
    @RequestMapping(value="/bankxml.htm", method= RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest arg0,
                                      HttpServletResponse arg1) throws Exception {
        ArrayList<Bank> empList = new ArrayList<Bank>();
        String filePath = "src/main/java/com/example/demo/XML/Bank.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("Bank");

            for (int i = 0; i < nodeList.getLength(); i++) {
                empList.add(getEmployee(nodeList.item(i)));
            }
            //lets print Employee list information
            for (Bank emp : empList) {
                int n = emp.getId();
                String g = emp.getPerson();
                double a = emp.getDolg();
                boolean r = emp.getPlatit();
                String m = emp.getPhone();
                System.out.println(n + " " + r + " "  + a + " "  + g+ " "  + m);
            }
        }
        catch (Exception e) {e.printStackTrace();}
        // Помещение результатов в параметр запроса
        ModelAndView model = new ModelAndView("employee");//Имя страницы, которая принимает данные
        model.addObject("employee", empList); //carManager.getCarList());
        return model;
    }

    //Заполнение очередного элемента списка сотрудников значениями из узла xml-документа
    private static Bank getEmployee(Node node) {
        Bank emp = new Bank();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            emp.setId(Integer.parseInt(getTagValue("id", element)));
            emp.setPerson(getTagValue("person", element));
            emp.setDolg(Double.parseDouble(getTagValue("dolg", element)));
            emp.setPlatit(Boolean.parseBoolean(getTagValue("platit", element)));
            emp.setPhone(getTagValue("phone", element));
        }

        return emp;
    }

    private static  String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
}


