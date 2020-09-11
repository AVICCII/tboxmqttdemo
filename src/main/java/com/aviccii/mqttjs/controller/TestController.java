package com.aviccii.mqttjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aviccii 2020/9/11
 * @Discrimination
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String test(Model model){
        return "index";
    }

}
