package com.hugo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello Springboot";
    }
   @RequestMapping("index")
   public String index(HttpServletRequest request){
        request.setAttribute("msg", "This is Hugo");
        return "index";

   }
}