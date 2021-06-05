package com.test;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

@Named
@FacesConfig
@ApplicationScoped
public class TestBean {

    public TestEnum getValue1() {
        return TestEnum.VALUE1;
    }
    
    public TestEnum getValue2() {
        return TestEnum.VALUE2;
    }

    public String getMessage(final EnumInterface enumInstance) {
        return "getMessage(final EnumInterface enumInstance)";
    }

    public String getMessage(final String messageKey, final Serializable... arguments) {
        return "getMessage(final String messageKey, final Serializable... arguments)";
    }
}