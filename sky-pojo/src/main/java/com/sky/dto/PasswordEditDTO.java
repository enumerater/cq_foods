package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("修改密码DTO")
public class PasswordEditDTO implements Serializable {

    @ApiModelProperty("员工id")
    private Integer empId; //员工id
    @ApiModelProperty("旧密码")
    private String oldPassword;    //旧密码
    @ApiModelProperty("新密码")
    private String newPassword;    //新密码
}
