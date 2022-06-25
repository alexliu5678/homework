package com.liu.ucenter.web;

import com.liu.ucenter.domain.entity.User;

public class VoTransToBo {
    public static User tranfer(UserVo vo){
        if(vo==null)
            return null;
        User user = new User();
        user.setId(vo.getId());
        user.setUsername(vo.getUsername());
        user.setPasswd(vo.getPasswd());
        return user;
    }
}
