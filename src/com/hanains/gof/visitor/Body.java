package com.hanains.gof.visitor;

public class Body implements CarElement{
	 public void accept(CarElementVisitor visitor) {
	        visitor.visit(this);
	    }
}
