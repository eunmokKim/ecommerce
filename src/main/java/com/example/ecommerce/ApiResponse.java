package com.example.ecommerce;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;


    public static <T> ApiResponse<T> ok(T data){
        return (ApiResponse<T>) ApiResponse.builder()
                .code(200)
                .message("성공")
                .data(data)
                .build();
    }
}
