package us.supercheng.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class AppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "jsp/index";
    }

    // This is JSP Page
    @RequestMapping(value = "/jsp", method = RequestMethod.GET)
    public String landingPageJsp(Map<String, Object> map) {
        map.put("hello", "JSP Hello");
        return "jsp/jsp";
    }

    // This is Thymeleaf Page
    @RequestMapping(value = "/thymeleaf", method = RequestMethod.GET)
    public String landingPageThymeleaf(Map<String, Object> map) {
        map.put("hello", "Thymeleaf Hello");
        return "templates/thymeleaf";
    }

    // This is Freemarker Page
    @RequestMapping(value = "/freemarker", method = RequestMethod.GET)
    public String landingPageFreemarker(Map<String, Object> map) {
        map.put("hello", "Freemarker Hello");
        return "ftl/freemarker";
    }

}
