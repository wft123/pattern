package com.hanains.gof.builder;

public interface Builder {
    void makeArm();
    void makeLeg();
    Hero getResult();
}