package com.healthcare.starter.demo;

public interface ParentRepository {

    Parent save(Parent p) throws ParentDataException;
}
