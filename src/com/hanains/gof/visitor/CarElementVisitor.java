package com.hanains.gof.visitor;

public interface CarElementVisitor {
	void visit(Wheel wheel);
	void visit(Engine engine);
	void visit(Body body);
	void visit(Car car);
}
