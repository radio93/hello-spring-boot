package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = {"", "/index"})
    public String index(Model model) {
        model.addAttribute("msg", "谢谢访问");
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "index2";
    }

    @RequestMapping("/index3")
    public String index3(){
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4(){
        return "index4";
    }


    @RequestMapping(value = "/addr",method = RequestMethod.POST)
    @ResponseBody
    public String addr(@RequestBody String str){
        System.out.println(str);
        return null;
    }
}
