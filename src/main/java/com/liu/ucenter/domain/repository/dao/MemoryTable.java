package com.liu.ucenter.domain.repository.dao;

import com.liu.ucenter.domain.entity.User;
import com.liu.ucenter.domain.repository.po.UserPo;

import java.util.concurrent.ConcurrentHashMap;


public class MemoryTable {
    private static ConcurrentHashMap<String, UserPo> info = new ConcurrentHashMap<String,UserPo>();

    public static ConcurrentHashMap<String, UserPo> getInfo() {
        return info;
    }

    public static void setInfo(ConcurrentHashMap<String, UserPo> info) {
        MemoryTable.info = info;
    }


    public static boolean insert(UserPo userPo ){
        String id = userPo.getId();
        UserPo po = info.get(id);
        if(po!=null)
            return false;
        else{
            info.put(id,userPo);
            return true;
        }
    }

    public static boolean update(UserPo userPo ){
        String id = userPo.getId();
        UserPo result  = info.put(id,userPo);
        if (result!=null )
            return true;
        else return false;
    }

    public static boolean delete(UserPo userPo ){
        String id = userPo.getId();
        UserPo result  = info.remove(id);

        if (result!=null )
            return true;
        else return false;
    }

    public static UserPo  find (UserPo userPo ){
        String id = userPo.getId();
        UserPo result  = info.get(id);

        if (result!=null )
            return result;
        else return null;
    }
}
