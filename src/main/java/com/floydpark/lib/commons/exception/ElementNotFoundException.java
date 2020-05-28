package com.floydpark.lib.commons.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ElementNotFoundException extends GeneralException {

    public ElementNotFoundException(String message) {
        super(message);
    }

    public ElementNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ElementNotFoundException(String message, Throwable throwable, List<String> errors) {
        super(message, throwable, errors);
    }

    public ElementNotFoundException(String message, List<String> errors) {
        super(message, errors);
    }

    @Override
    public HttpStatus getErrorHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
