package com.floydpark.lib.commons.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class BusinessException extends GeneralException {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public BusinessException(String message, Throwable throwable, List<String> errors) {
        super(message, throwable, errors);
    }

    public BusinessException(String message, List<String> errors) {
        super(message, errors);
    }

    @Override
    public HttpStatus getErrorHttpStatus() {
        return HttpStatus.CONFLICT;
    }
}
