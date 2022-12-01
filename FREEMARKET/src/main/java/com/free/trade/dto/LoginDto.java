package com.free.trade.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoginDto {
    String name;
    String userId;
    String userPw;
    String userPwChk;
    String email;
    Date birth;
    Date joinDate; //가입일자
    int writeCnt; //글 작성 갯수
    String contentsList; // 글 내용 이력
    String commentList; //댓글 작성 이력

}
