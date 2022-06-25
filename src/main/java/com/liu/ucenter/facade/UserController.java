package com.liu.ucenter.facade;

import com.liu.ucenter.application.service.NotificationService;
import com.liu.ucenter.application.service.UserService;
import com.liu.ucenter.infrastruct.exception.BusinessException;
import com.liu.ucenter.domain.entity.User;
import com.liu.ucenter.domain.repository.factory.UserFactory;
import com.liu.ucenter.domain.repository.po.UserPo;
import com.liu.ucenter.web.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  user controller
 */
@RestController
@RequestMapping("/api/v1")
@Api(value = "user interface", tags = "user manager interface")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService services;
    @Autowired
    private UserFactory userFactory;
    @Autowired
    private NotificationService notificationService;

    /**
     *
     * @param vo
     * @return DateResult
     * @throws BusinessException
     */
    @PostMapping("/update")
    public Result updateUser(@RequestBody UserVo vo) throws BusinessException {
        User user = VoTransToBo.tranfer(vo);
        DateResult<User> result = new DateResult<>();
        if(services.update(user)){
            result.setCode(ResultCode.SUCCESS.code());
            result.setMsg(ResultCode.SUCCESS.getMsg());
        }else{
            result.setCode(ResultCode.FAILED.code());
            result.setMsg(ResultCode.FAILED.getMsg());
        }

        result.setResult(user);
        return result;
    }

    /**
     *
     * @param vo
     * @return DateResult
     * @throws Exception
     */
    @PostMapping("/add")
    @ApiImplicitParam(name = "vo", value = "user data")
    @ApiOperation(value = "add user ", notes = "add user")
    public DateResult<User>  addUser(@RequestBody UserVo vo) throws BusinessException {
        User user = VoTransToBo.tranfer(vo);
        DateResult<User> result = new DateResult<>();
        if(services.save(user)){
            result.setCode(ResultCode.SUCCESS.code());
            result.setMsg(ResultCode.SUCCESS.getMsg());
        }else{
            result.setCode(ResultCode.FAILED.code());
            result.setMsg(ResultCode.FAILED.getMsg());
        }
        result.setResult(user);
        notificationService.sendMail();
        return result;
    }

    /**
     *
     * @param vo
     * @return DateResult
     * @throws BusinessException
     */
    @PostMapping("/delete")
    public Result deleteUser(@RequestBody UserVo vo) throws BusinessException {
        User user = VoTransToBo.tranfer(vo);
        DateResult<User> result = new DateResult<>();
        if(services.delete(user)){
            result.setCode(ResultCode.SUCCESS.code());
            result.setMsg(ResultCode.SUCCESS.getMsg());
        }else{
            result.setCode(ResultCode.FAILED.code());
            result.setMsg(ResultCode.FAILED.getMsg());
        }

        result.setResult(user);
        return result;
    }

    /**
     *
     * @param vo
     * @return DateResult
     * @throws BusinessException
     */
    @PostMapping("/find")
    public Result findUser(@RequestBody UserVo vo) throws BusinessException {
        User user = VoTransToBo.tranfer(vo);
        DateResult<User> result = new DateResult<>();

        UserPo userPo = services.findById(user);
        if(userPo!=null&&userPo.getId()!=null) {
            result.setResult(userFactory.PoToUser(userPo));
            result.setCode(ResultCode.SUCCESS.code());
            result.setMsg(ResultCode.SUCCESS.getMsg());
        }else{
            result.setCode(ResultCode.FAILED.code());
            result.setMsg(ResultCode.FAILED.getMsg());
        }
        return result;
    }

}
