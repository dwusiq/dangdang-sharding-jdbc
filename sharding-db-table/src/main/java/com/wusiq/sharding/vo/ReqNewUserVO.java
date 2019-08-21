package com.wusiq.sharding.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @program: dangdang-sharding-jdbc
 * @description: add user entry entity
 * @author: dwusiq
 * @create: 2019-08-19 15:15
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqNewUserVO {
    @NotNull
    private Integer userID; //生产环境中，由后台维护，而不是用户传入
    @NotEmpty
    private String userName;
}
