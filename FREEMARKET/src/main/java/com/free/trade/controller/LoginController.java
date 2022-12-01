package com.free.trade.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/freeMarket/login")
    public String loginController(Model model){

        logger.info("## loginController 진입 ##");
        return "login";
    }
}
