package com.liu.ucenter.infrastruct.exceptionHandler;

import com.liu.ucenter.domain.entity.User;
import com.liu.ucenter.web.DateResult;
import com.liu.ucenter.web.ResultCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * global exceptioin handler
 */
@RestControllerAdvice
public class RestExceptionHandler {
    /**
     *
     * @param request
     * @param e
     * @return DateResult
     */
    @ExceptionHandler(value = Exception.class)
    public DateResult<User> businessExceptionHandler(HttpServletRequest request, Exception e)
             {
        //log.error("BusinessException异常：{}", e.getMessage());
        DateResult<User> data = new DateResult<>();
        data.setCode(ResultCode.FAILED.code());
        data.setMsg(ResultCode.FAILED.getMsg());
        return data;
    }

}
