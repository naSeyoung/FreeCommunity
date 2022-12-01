package com.free.trade.controller;

import com.free.trade.dto.LoginDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(MainController.class);
    LoginDto loginDto = new LoginDto();
    @GetMapping("/freeMarket/login")
    public String loginController(HttpSession session){
        logger.info("## loginController 진입 ##");
        //   session.getAttribute("id",id);
        return "login";
    }
    public String loginCheckController(HttpSession session){

        return "redirect:/";
    }
}
