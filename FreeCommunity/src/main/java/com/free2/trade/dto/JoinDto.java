package com.free.trade.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class JoinDto {
    String name;
    String userId;
    String userPw;
    String userPwChk;
    String email;
    Date birth;
    Date joinDate; //가입일자
    String termsCheckYn; //약관 체크 유무

}
