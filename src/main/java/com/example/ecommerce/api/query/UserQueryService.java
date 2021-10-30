package com.example.ecommerce.api.query;

import com.example.ecommerce.api.view.UserView;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserQueryService {

    public List<UserView> getUserList(){
        return Arrays.asList(getUser(), getUser1());
    }
    
    private UserView getUser(){
        return UserView.builder()
                .id(1L)
                .loginId("login1")
                .name("홍길동")
                .build();
    }

    private UserView getUser1(){
        return UserView.builder()
                .id(2L)
                .loginId("login2")
                .name("홍길동2")
                .build();
    }
}
