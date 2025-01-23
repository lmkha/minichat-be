package com.example.minichat.utils.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SuccessResponse<T> extends Response<T> {
    public SuccessResponse(String message, T data) {
        super(true, message, data);
    }
}
