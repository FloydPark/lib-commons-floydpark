package com.floydpark.lib.commons.util;

import com.floydpark.lib.commons.dto.ErrorDTO;
import com.floydpark.lib.commons.dto.ResponseDTO;
import com.floydpark.lib.commons.exception.IFloydparkException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.Collection;

public enum ResponseEntityUtil {

    INSTANCE;

    public ResponseEntity<Serializable> handleException(IFloydparkException e){

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setErrors(e.getErrors());
        return new ResponseEntity<>(errorDTO, e.getErrorHttpStatus());
    }

    public ResponseEntity<Serializable> handleSingleResponse(Serializable response){

        return handleSingleResponse(response, HttpStatus.OK);
    }

    public ResponseEntity<Serializable> handleSingleResponse(Serializable response, HttpStatus httpStatus){

        ResponseDTO<Serializable> responseDTO = new ResponseDTO<>();
        responseDTO.setData(response);
        return new ResponseEntity<>(responseDTO, httpStatus);
    }

    public ResponseEntity<Serializable> handleCollectionResponse(Collection response){

        ResponseDTO<Collection> responseDTO = new ResponseDTO<>();
        responseDTO.setData(response);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}