package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest req,
                            Model model
    ) {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        model.addAttribute("message", "Hi, "+ name + " "+ surname);
        System.out.println("Hi, "+ name + " "+ surname);


        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}