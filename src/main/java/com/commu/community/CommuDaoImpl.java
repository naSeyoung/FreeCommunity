package com.commu.community;


import com.commu.common.dto.CommunityDto;
import com.commu.main.MainController;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommuDaoImpl implements CommuDao {
    Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<CommunityDto> getCommunityList(CommunityDto communityDto){
        logger.info("daoImpl");
        return sqlSession.selectList("com.commu.community.CommuDao.getCommunityList",communityDto);
    }

}
