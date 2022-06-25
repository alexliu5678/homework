package com.liu.ucenter.application.service;

import com.liu.ucenter.infrastruct.exception.BusinessException;
import com.liu.ucenter.domain.entity.User;
import com.liu.ucenter.domain.repository.po.UserPo;


/**
 *  user service interface
 */
public interface UserService {
    public boolean save(User user) throws BusinessException;
    public UserPo findById(User user) throws BusinessException;
    public boolean delete(User user) throws BusinessException;
    public boolean update(User user) throws BusinessException;
}
