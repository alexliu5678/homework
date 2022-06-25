package com.liu.ucenter.domain.repository.interfaces;

import com.liu.ucenter.domain.repository.po.UserPo;

public interface UserRepository {
    public boolean save(UserPo po);
    UserPo findById(UserPo po);
    public boolean delete(UserPo po);
    public boolean update(UserPo po);
}
