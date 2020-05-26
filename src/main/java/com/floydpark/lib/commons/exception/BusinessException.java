package com.floydpark.lib.commons.exception;

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
}
