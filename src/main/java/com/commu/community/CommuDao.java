package com.commu.community;

import com.commu.common.dto.CommunityDto;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommuDao {

    private SqlSessionTemplate sqlSession;
    private CommunityDto communityDto;

    public List<CommunityDto> getCommunityList(CommunityDto communityDto){
        return sqlSession.selectList("CommuMapper.getCommunityList", communityDto);
    }

}
