package com.example.minichat.utils.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ErrorResponse<T> extends Response<T> {
    public ErrorResponse(String message) {
        super(false, message, null);
    }
}
