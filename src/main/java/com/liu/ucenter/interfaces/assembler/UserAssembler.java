package com.liu.ucenter.interfaces.assembler;

import com.liu.ucenter.domain.entity.User;
import com.liu.ucenter.interfaces.dto.userDTO;

/**
 * user do transfer to dto
 */
public class UserAssembler {
    /**
     *
     * @param userDo
     * @return userDTO
     */
    public static userDTO toDTO(User userDo) {
         userDTO userDto = new userDTO();

         return userDto;
    }

    //完成DO到DTO转换
//    public static Leave toDO(userDTO leaveDTO) {
//        val leave = new Leave();
//        //转换过程略......
//        return leave;
//    }

}
