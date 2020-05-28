package com.floydpark.lib.commons.util;

import com.floydpark.lib.commons.dto.ErrorDTO;
import com.floydpark.lib.commons.exception.IFloydparkException;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public enum ResponseEntityUtil {

    INSTANCE;

    public ResponseEntity<Serializable> handleException(IFloydparkException e){

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setErrors(e.getErrors());
        return new ResponseEntity<>(errorDTO, e.getErrorHttpStatus());
    }
}