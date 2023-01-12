package com.commu.community;

import com.commu.common.dto.CommunityDto;
import com.commu.main.MainController;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Controller
public class CommuController {
    @Autowired
    private CommuService commuService;

    Logger logger = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/dittoList")
    public String getCommunityList(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        CommunityDto communityDto = new CommunityDto();
        logger.info("dittoList 시작 ");
        List<CommunityDto> list = commuService.getCommunityList(communityDto);

        if(list == null || list.size() == 0){
            logger.info("진짜 못받아오는거임 ");
        }if(list != null || list.size() != 0){
            logger.info("있는데 안보임");
        }
        model.addAttribute("list",list);



        return "communityList";
    }
    @GetMapping("/dittoListDetail")
    public String getContentDetail(HttpServletRequest request, HttpServletResponse response, Model model, @RequestParam int contentNo){

        return "communityDetail";
    }
}
