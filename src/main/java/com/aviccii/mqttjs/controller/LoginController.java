package com.aviccii.mqttjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author aviccii 2020/9/14
 * @Discrimination
 */
@Controller
public class LoginController {

    @PostMapping("/userLogin")
    public String login(@RequestParam("loginUsername")String username, @RequestParam("loginPassword") String password,
                        Model model, HttpSession httpSession){
        System.out.println(username+"   "+password);
        if (password.equals("123456")){
            model.addAttribute("loginUsername",username);
            httpSession.setAttribute("loginUser",username);
            return "index";
        }else {
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }

}
