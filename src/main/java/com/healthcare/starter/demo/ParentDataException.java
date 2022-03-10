package com.healthcare.starter.demo;

import lombok.Getter;

@Getter
public class ParentDataException extends Exception {

    private int code;

    public ParentDataException(String message, int code, Exception inner) {
        super(message, inner);
        this.code = code;
    }

    public ParentDataException(String message, int code) {
        this(message, code, null);
    }
}
