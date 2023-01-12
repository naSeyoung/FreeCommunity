package com.commu.community;

import com.commu.common.dto.CommunityDto;
import com.commu.main.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommuService {

    List<CommunityDto> getCommunityList(CommunityDto communityDto);


}