package com.commu.common.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class CommunityDto {

    private int contentNo;
    private String title;
    private String contents;
    private String regUserId;
    private String regDate;
    private int likeCnt;
    private String updDate;




}
