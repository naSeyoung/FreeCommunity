package com.commu.main;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);
    @GetMapping(value={"/" ,"/ditto"})
    public String mainController(){
        logger.info("index.html 진입 #####");



        return "index";
    }


}
