package com.floydpark.lib.commons.util;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public enum DozerUtil {

    INSTANCE;

    private Mapper mapper = new DozerBeanMapper();

    public Mapper getMapper() {
        return mapper;
    }
}
