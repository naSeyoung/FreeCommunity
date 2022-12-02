package com.free.trade.controller;

import javax.servlet.http.HttpSession;

public class UserController {
    public static final String SESSION_USERID = "USERID";
    /**
     * 사용자 정보 세션에서 조회
     * */
    public static String getUseridInSession(HttpSession session){
        if(session != null){
            return (String) session.getAttribute(SESSION_USERID);

        }
        return null;
    }

    /**
     * @param session
     * @return
     * 로그인 상태 여부 세션에서 조회
     */
    public static boolean isLogged(HttpSession session){
        String userid = getUseridInSession(session);

        return userid != null;
    }

}
