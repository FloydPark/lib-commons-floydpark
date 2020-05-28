package com.floydpark.lib.commons.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public interface IFloydparkException {

    List<String> getErrors();
    HttpStatus getErrorHttpStatus();
}
