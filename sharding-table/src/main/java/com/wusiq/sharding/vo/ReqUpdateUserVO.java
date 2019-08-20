package com.wusiq.sharding.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @program: dangdang-sharding-jdbc
 * @description: update user entry entity
 * @author: dwusiq
 * @create: 2019-08-19 15:17
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqUpdateUserVO {
    @NotNull
    private Integer userID;
    @NotBlank
    private String userName;
}
