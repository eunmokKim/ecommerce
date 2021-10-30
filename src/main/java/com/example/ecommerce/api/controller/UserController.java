package com.example.ecommerce.api.controller;

import com.example.ecommerce.ApiResponse;
import com.example.ecommerce.api.query.UserQueryService;
import com.example.ecommerce.api.view.UserView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserQueryService userQueryService;

    public UserController(UserQueryService userQueryService) {
        this.userQueryService = userQueryService;
    }

    @GetMapping(value = "/user")
    public ApiResponse<List<UserView>> getUserList(){
        return ApiResponse.ok(userQueryService.getUserList());
    }
}
