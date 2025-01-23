package com.example.minichat.utils.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Response<T> {
    private boolean success;
    private String message;
    private T data;
}
