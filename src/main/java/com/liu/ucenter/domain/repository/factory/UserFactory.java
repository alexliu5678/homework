package com.liu.ucenter.domain.repository.factory;

import com.liu.ucenter.domain.entity.User;
import com.liu.ucenter.domain.repository.po.UserPo;
import org.springframework.stereotype.Service;

/**
 * user persistence and domain object factory
 */
@Service
public class UserFactory {
    /**
     *
     * @param user
     * @return user persistence object
     */
    public UserPo userToPo(User user){
        UserPo po = new UserPo();
        po.setId(user.getId());
        po.setName(user.getUsername());
        po.setPasswd(user.getPasswd());
        return po;
    }

    /**
     *
     * @param po
     * @return user domain object
     */
    public User PoToUser(UserPo po){
        User user = new User();
        user.setId(po.getId());
        user.setUsername(po.getName());
        user.setPasswd(po.getPasswd());
        return user;
    }
}
