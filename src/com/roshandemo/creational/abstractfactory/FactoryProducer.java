package com.roshandemo.creational.abstractfactory;

public class FactoryProducer {

	public FactoryProducer() {
		// TODO Auto-generated constructor stub
	}

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}

}
