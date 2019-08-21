package com.wusiq.sharding.mapper;

import com.wusiq.sharding.po.TbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @program: dangdang-sharding-jdbc
 * @description: repository of user
 * @author: dwusiq
 * @create: 2019-08-19 14:55
 **/
@Repository
public interface UserMapper {
    void insert(TbUser user);

    void update(TbUser user);

    TbUser findByUserID(@Param("userID") int userID);

    void deleteByUserID(@Param("userID") int userID);

    int getMaxId();
}
