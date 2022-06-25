package com.liu.ucenter.infrastruct.exception;

/**
 * custumermize define exception
 */
public class BusinessException extends Exception {
    private Integer code;

    private String message;

    /**
     *
     * @param code
     * @param message
     */
    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}
