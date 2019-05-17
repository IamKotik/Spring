package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController {
    @RequestMapping(value="/about.htm", method= RequestMethod.GET)
    public String demo(ModelMap map) {
        MyPerson person = new MyPerson();
        person.setName("Делов Алексей");
        person.setAge(19);
        person.setGroup("2ПМИ");
        map.addAttribute("personObject", person);
        map.addAttribute("message", "Данные получены от контроллера");
        return "about";
    }

    public class MyPerson {
        private String name;
        private int age;
        private String group;

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

