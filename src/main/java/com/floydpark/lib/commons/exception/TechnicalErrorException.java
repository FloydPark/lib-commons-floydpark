package com.floydpark.lib.commons.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class TechnicalErrorException extends GeneralException {
    public TechnicalErrorException(String message) {
        super(message);
    }

    public TechnicalErrorException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public TechnicalErrorException(String message, Throwable throwable, List<String> errors) {
        super(message, throwable, errors);
    }

    public TechnicalErrorException(String message, List<String> errors) {
        super(message, errors);
    }

    @Override
    public HttpStatus getErrorHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
