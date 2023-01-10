package com.commu.login;

import com.commu.main.MainController;
import com.commu.common.dto.LoginDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class LoginController {

    Logger logger = LoggerFactory.getLogger(MainController.class);
   // LoginDto loginDto = new LoginDto();

    @GetMapping("/freeMarket/login")
    public String loginController(HttpSession session){
        logger.info("## loginController 진입 ##");
         //  session.getAttribute("id",id);

        return "login";
    }
    @PostMapping("/freeMarket/loginCheck")
    public String loginCheckController(HttpServletRequest request,Model model ){
        HttpSession session = request.getSession();
        LoginDto loginDto = new LoginDto();
        logger.info("## /freeMarket/loginCheck 진입 ##");

        session.setAttribute("a",loginDto.getUserId());
        logger.info("loginDto.getUserId(){}",loginDto.getUserId());
        logger.info("아이디 맞음 ");
        return "redirect:/freeMarket/home";
    }
}
