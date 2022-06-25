package com.liu.ucenter.application.service;

import com.liu.ucenter.infrastruct.exception.BusinessException;
import com.liu.ucenter.domain.entity.User;
import com.liu.ucenter.domain.repository.factory.UserFactory;
import com.liu.ucenter.domain.repository.interfaces.UserRepository;
import com.liu.ucenter.domain.repository.po.UserPo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user service implement
 */

@Service
public class UserServiceImpl implements UserService{

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserFactory userFactory;

    /**
     *
     * @param user
     * @return boolean
     * @throws BusinessException
     */
    public boolean save(User user) throws BusinessException {
        return userRepository.save(userFactory.userToPo(user));
    }

    /**
     *
     * @param user
     * @return boolean
     * @throws BusinessException
     */
    public UserPo findById(User user) throws BusinessException {
        return userRepository.findById(userFactory.userToPo(user));
    }

    /**
     *
     * @param user
     * @return boolean
     * @throws BusinessException
     */
    public boolean delete(User user) throws BusinessException {
        return userRepository.delete(userFactory.userToPo(user));
    }

    /**
     *
     * @param user
     * @return boolean
     * @throws BusinessException
     */
    public boolean update(User user) throws BusinessException {
        return userRepository.update(userFactory.userToPo(user));
    }
}
