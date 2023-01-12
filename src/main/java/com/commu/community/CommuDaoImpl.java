package com.commu.community;


import com.commu.common.dto.CommunityDto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommuDaoImpl implements CommuDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<CommunityDto> getCommunityList(CommunityDto communityDto){
        return sqlSession.selectList("CommuMapper.getCommunityList", communityDto);
    }

}
