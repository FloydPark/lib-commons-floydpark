package com.floydpark.lib.commons.exception;

import java.util.ArrayList;
import java.util.List;

abstract class GeneralException extends Exception{

    private List<String> errors;

    GeneralException(String message){
        super(message);
        init(message);
    }

    GeneralException(String message, Throwable throwable){
        super(message, throwable);
        init(message);
    }

    GeneralException(String message, Throwable throwable, List<String> errors){
        super(message, throwable);
        init(errors);
    }

    GeneralException(String message, List<String> errors){
        super(message);
        init(errors);
    }

    public List<String> getErrors() {
        return errors;
    }

    private void init(String message){

        this.errors = new ArrayList<>();
        this.errors.add(message);
    }

    private void init(List<String> errors){

        this.errors = new ArrayList<>();
        if(errors != null){
            this.errors.addAll(errors);
        }
    }
}
