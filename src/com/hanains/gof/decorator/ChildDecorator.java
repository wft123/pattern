package com.hanains.gof.decorator;

public class ChildDecorator extends Decorator{
    private Decorator decorator;
    public ChildDecorator(Decorator decorator){
        this.decorator = decorator;
    }
    @Override
    public String getMerong(){
        return "@" + decorator.getMerong() + "@";
    }
}