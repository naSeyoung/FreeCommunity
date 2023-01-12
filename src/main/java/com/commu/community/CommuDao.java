package com.commu.community;

import com.commu.common.dto.CommunityDto;

import java.util.List;

public interface CommuDao {

    List<CommunityDto> getCommunityList(CommunityDto communityDto);
}
