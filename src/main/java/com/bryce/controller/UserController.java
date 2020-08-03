package com.bryce.controller;

import com.bryce.common.CommonResult;
import com.bryce.entity.User;
import com.bryce.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @ClassName UserController
 * @Description user controller
 * @Author Bryce
 * @Date 2020-07-20 10:25
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/login")
    public CommonResult login(@Valid @RequestBody User user){
        System.out.println(user);
        return userService.login(user.getUsername(), user.getPassword());
    }

    @RequestMapping("/logout")
    public CommonResult logout(){
        return userService.logout();
    }

    @RequestMapping("/loginPage")
    public CommonResult loginPage(){
        return CommonResult.failed("please login");
    }

    @RequestMapping("/unauthorizedPage")
    public CommonResult unauthorizedPage(){
        return CommonResult.failed("unauthorizedPage");
    }
}
