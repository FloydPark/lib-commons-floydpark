package com.floydpark.lib.commons.exception;

import java.util.List;

public class ValidationException extends GeneralException {

    public ValidationException(String message){
        super(message);
    }

    public ValidationException(String message, Throwable throwable){
        super(message, throwable);
    }

    public ValidationException(String message, Throwable throwable, List<String> errors){
        super(message, throwable, errors);
    }

    public ValidationException(String message, List<String> errors){
        super(message, errors);
    }
}
