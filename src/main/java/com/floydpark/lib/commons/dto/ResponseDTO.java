package com.floydpark.lib.commons.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseDTO<T> implements Serializable {

    private T data;
    private Pagination query;

    @Data
    public class Pagination implements Serializable{

        private String previous;
        private String next;
        private String last;
    }
}
