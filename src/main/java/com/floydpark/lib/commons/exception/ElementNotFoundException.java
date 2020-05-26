package com.floydpark.lib.commons.exception;

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
}
