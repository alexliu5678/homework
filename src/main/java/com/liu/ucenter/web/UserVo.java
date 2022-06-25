package com.liu.ucenter.web;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserVo {
    @NotNull(message = "id must")
    String id;
    @NotNull(message = "username must")
    String username;
    @NotNull(message = "password must")
    String passwd;
}
