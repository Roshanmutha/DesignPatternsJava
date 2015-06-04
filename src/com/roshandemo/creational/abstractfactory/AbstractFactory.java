package com.roshandemo.creational.abstractfactory;

public abstract class AbstractFactory {

	public abstract IShape getShape(String shapeType) ;

	
	public abstract IColor getColor(String shapeType);
	
	
}
