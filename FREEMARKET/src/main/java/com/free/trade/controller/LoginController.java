package com.free.trade.controller;

import com.free.trade.dto.LoginDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Map;

@Slf4j
@Controller
public class LoginController {

    Logger logger = LoggerFactory.getLogger(MainController.class);
   // LoginDto loginDto = new LoginDto();
    @GetMapping("/freeMarket/login")
    public String loginController(HttpSession session){
        logger.info("## loginController 진입 ##");
         //  session.getAttribute("id",id);
        String auth =
        return "login";
    }
    @GetMapping("/freeMarket/loginCheck")
    public String loginCheckController(HttpServletRequest request,Model model ){
        HttpSession session = request.getSession();
        LoginDto loginDto = new LoginDto();
        logger.info("## /freeMarket/loginCheck 진입 ##");
            logger.info("아이디 맞음 ");
        session.setAttribute("a",loginDto.getUserId());
        model.getAttribute("loginId","");
        return "redirect:/";
    }
}
