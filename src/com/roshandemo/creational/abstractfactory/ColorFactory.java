/**
 * 
 */
package com.roshandemo.creational.abstractfactory;

/**
 * @author roshankumarm
 *
 */
public class ColorFactory extends AbstractFactory {

	/**
	 * 
	 */
	public ColorFactory() {
		// TODO Auto-generated constructor stub
	}

	public IColor getColor(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Red")) {
			return new Red();
		} else if (shapeType.equalsIgnoreCase("Blue")) {
			return new Blue();
		} else if (shapeType.equalsIgnoreCase("Green")) {
			return new Green();
		}
		return null;
	}

	@Override
	public IShape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
