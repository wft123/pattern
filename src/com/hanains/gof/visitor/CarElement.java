package com.hanains.gof.visitor;

interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}