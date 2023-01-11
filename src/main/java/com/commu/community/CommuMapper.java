package com.commu.community;

import com.commu.common.dto.CommunityDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommuMapper {

    public List<CommunityDto> getCommunityList(CommunityDto communityDto);
}
