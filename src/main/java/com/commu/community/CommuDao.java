package com.commu.community;

import com.commu.common.dto.CommunityDto;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public class CommuDao {
    @Autowired
    private SqlSessionTemplate sqlSession;
    private CommunityDto communityDto;

    public List<CommunityDto> getCommunityList(CommunityDto communityDto){
        return sqlSession.selectList("CommuDao.getCommunityList", communityDto);
    }

}
