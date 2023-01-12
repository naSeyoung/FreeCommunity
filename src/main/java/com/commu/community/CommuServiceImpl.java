package com.commu.community;

import com.commu.common.dto.CommunityDto;
import com.commu.main.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuServiceImpl implements CommuService {
    Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private CommuDao commuDao;


    @Override
    public List<CommunityDto> getCommunityList(CommunityDto communityDto) throws Exception {
        logger.info("이거탐");
        List<CommunityDto> list = commuDao.getCommunityList(communityDto);
        return list;
    }


}
