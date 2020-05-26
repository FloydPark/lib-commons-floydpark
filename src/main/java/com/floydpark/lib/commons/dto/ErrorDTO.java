package com.floydpark.lib.commons.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class ErrorDTO implements Serializable {

    private List<String> errors;
}
