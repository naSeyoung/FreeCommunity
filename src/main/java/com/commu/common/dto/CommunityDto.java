package com.commu.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommunityDto {

    String title;
    String content;
    String regUser;
    String regDt;
    String likeCnt; //추천수


}
