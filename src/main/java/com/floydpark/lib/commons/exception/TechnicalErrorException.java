package com.floydpark.lib.commons.exception;

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
}
