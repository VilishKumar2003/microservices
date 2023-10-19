package com.op.user.service.payload;


import lombok.*;
import org.aspectj.internal.lang.annotation.ajcDeclareEoW;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

    public static ajcDeclareEoW builder() {
        return null;
    }
}