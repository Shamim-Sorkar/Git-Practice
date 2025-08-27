package com.shamim.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // works like servlet
public class HomeController {
    @ModelAttribute("course")
    public String courseName() {
        return "Java Spring Boot Backend";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv) {
        int result = num + num2;
        mv.addObject("res", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("ali", alien);
//        mv.setViewName("result");
        return "result";
    }
}
