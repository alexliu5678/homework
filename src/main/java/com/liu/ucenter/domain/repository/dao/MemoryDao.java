package com.liu.ucenter.domain.repository.dao;

import com.liu.ucenter.domain.repository.po.UserPo;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryDao {
    /**
     *
     * @param userPo
     * @return boolean
     */
    public  boolean insert(UserPo userPo ) {
        return MemoryTable.insert(userPo);
    }

    /**
     *
     * @param userPo
     * @return boolean
     */
    public boolean update(UserPo userPo ){
        return MemoryTable.update(userPo);
    }

    /**
     *
     * @param userPo
     * @return boolean
     */
    public boolean delete(UserPo userPo ){
        return MemoryTable.delete(userPo);
    }

    /**
     *
     * @param userPo
     * @return boolean
     */
    public UserPo find(UserPo userPo ){
        return MemoryTable.find(userPo);
    }
}
