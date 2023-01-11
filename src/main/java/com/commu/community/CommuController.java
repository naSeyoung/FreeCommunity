package com.commu.community;

import com.commu.common.dto.CommunityDto;
import com.commu.main.MainController;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Controller
public class CommuController {
    private CommuService commuService;

    private CommunityDto communityDto;
    Logger logger = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/dittoList")
    public String getCommunityList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<CommunityDto> list = commuService.getCommunityList();




        logger.info("setContents",communityDto.getContents());





        return "communityList";
    }
}
