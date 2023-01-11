package com.commu.community;

import com.commu.common.dto.CommunityDto;
import com.commu.main.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuService {
    Logger logger = LoggerFactory.getLogger(MainController.class);
    private CommuDao commuDao;

    private CommunityDto communityDto;

    public List getCommunityList() throws Exception {
       logger.info("이거탐");
        return commuDao.getCommunityList(communityDto);

    }

}