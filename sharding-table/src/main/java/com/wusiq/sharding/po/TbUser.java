package com.wusiq.sharding.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息表的映射类PO.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbUser {
    private Integer userID;
    private String userName;
}
