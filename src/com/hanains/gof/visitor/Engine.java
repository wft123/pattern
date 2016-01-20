package com.hanains.gof.visitor;

public class Engine implements CarElement{
	public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
