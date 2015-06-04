package com.roshandemo.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	public IColor getColor(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
}
