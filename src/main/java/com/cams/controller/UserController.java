package com.cams.controller;

import com.cams.dao.domain.User;
import com.cams.service.UserService;
import com.cams.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("")
    public Response addUser(@RequestBody User user) {
        User ret = userService.addUser(user);
        if (ret == null) return Response.errorMsg("注册失败！");
        else return Response.ok(ret);
    }
}
