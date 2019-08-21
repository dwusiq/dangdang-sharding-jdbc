package com.wusiq.sharding.service.impl;

import com.wusiq.sharding.mapper.UserMapper;
import com.wusiq.sharding.po.TbUser;
import com.wusiq.sharding.service.UserService;
import com.wusiq.sharding.vo.ReqNewUserVO;
import com.wusiq.sharding.vo.ReqUpdateUserVO;
import com.wusiq.sharding.vo.RspFindByUserID;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @program: dangdang-sharding-jdbc
 * @description: service of user
 * @author: dwusiq
 * @create: 2019-08-19 15:12
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void newUser(ReqNewUserVO user) {
        TbUser tbUser = new TbUser();
        BeanUtils.copyProperties(user, tbUser);
        userMapper.insert(tbUser);
    }

    @Override
    public void update(ReqUpdateUserVO user) {
        TbUser tbUser = userMapper.findByUserID(user.getUserID());
        if (Objects.isNull(tbUser)) {
            throw new RuntimeException("无效的用户编号");
        }
        BeanUtils.copyProperties(user, tbUser);
        userMapper.update(tbUser);
    }

    @Override
    public RspFindByUserID findByUserID(int userID) {
        TbUser user = userMapper.findByUserID(userID);
        RspFindByUserID resultUser = new RspFindByUserID(user.getUserID(), user.getUserName());
        return resultUser;
    }

    @Override
    public void deleteByUserID(int userID) {
        userMapper.deleteByUserID(userID);
    }

    @Override
    public int getMaxId() {
        return userMapper.getMaxId();
    }
}
