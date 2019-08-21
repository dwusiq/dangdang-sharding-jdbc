package com.wusiq.sharding.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: dangdang-sharding-jdbc
 * @description: response of find user by id
 * @author: dwusiq
 * @create: 2019-08-20 15:21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RspFindByUserID {
    private Integer id;
    private String name;
}
