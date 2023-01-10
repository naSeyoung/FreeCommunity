package com.commu.community;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class CommuController {
    @GetMapping("/dittoList")
    public String getCommunityList(HttpServletRequest request, HttpServletResponse response, Model model){

        return "communityList";
    }
}
