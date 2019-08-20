package com.wusiq.sharding.service;

import com.wusiq.sharding.po.TbUser;
import com.wusiq.sharding.vo.ReqNewUserVO;
import com.wusiq.sharding.vo.ReqUpdateUserVO;
import com.wusiq.sharding.vo.RspFindByUserID;

/**
 * interface of user.
 */
public interface UserService {
    void newUser(ReqNewUserVO user);

    void update(ReqUpdateUserVO user);

    RspFindByUserID findByUserID(int userID);

    void deleteByUserID(int userID);
}
