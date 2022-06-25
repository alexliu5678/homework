package com.liu.ucenter.infrastruct.repository;

import com.liu.ucenter.domain.repository.dao.MemoryDao;
import com.liu.ucenter.domain.repository.interfaces.UserRepository;
import com.liu.ucenter.domain.repository.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * user repository implement
 */

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private MemoryDao memoryDao;

    /**
     *
     * @param userPo
     * @return boolean
     */
    @Override
    public boolean save(UserPo userPo) {
        return memoryDao.insert(userPo);
    }

    /**
     *
     * @param userPo
     * @return user persistence object
     */
    @Override
    public UserPo findById(UserPo userPo) {
        return memoryDao.find(userPo);
    }

    /**
     *
     * @param userPo
     * @return boolean
     */
    @Override
    public boolean delete(UserPo userPo) {
        return  memoryDao.delete(userPo);
    }

    /**
     *
     * @param userPo
     * @return boolean
     */
    @Override
    public boolean update(UserPo userPo) {
        return  memoryDao.update(userPo);
    }
}
