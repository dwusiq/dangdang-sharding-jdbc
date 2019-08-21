package com.wusiq.sharding.controller;

import com.wusiq.sharding.service.UserService;
import com.wusiq.sharding.vo.ReqNewUserVO;
import com.wusiq.sharding.vo.ReqUpdateUserVO;
import com.wusiq.sharding.vo.RspFindByUserID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: dangdang-sharding-jdbc
 * @description: api of user
 * @author: dwusiq
 * @create: 2019-08-19 15:20
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void newUser(@RequestBody @Valid ReqNewUserVO user) {
        userService.newUser(user);
    }

    @PutMapping
    public void update(@RequestBody @Valid ReqUpdateUserVO user) {
        userService.update(user);
    }

    @GetMapping("/{userID}")
    public RspFindByUserID findByUserID(@PathVariable("userID") Integer userID) {
        return userService.findByUserID(userID);
    }

    @DeleteMapping("/{userID}")
    public void deleteByUserID(@PathVariable("userID") Integer userID) {
        userService.deleteByUserID(userID);
    }


    //TODO 这个接口会报错
    @GetMapping("/maxID")
    public int getMaxID() {
        return userService.getMaxId();
    }
}
