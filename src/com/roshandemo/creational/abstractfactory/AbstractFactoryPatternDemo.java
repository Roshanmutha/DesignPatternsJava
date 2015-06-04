/**
 * 
 */
package com.roshandemo.creational.abstractfactory;

/**
 * @author roshankumarm
 *
 */
public class AbstractFactoryPatternDemo {

	/**
	 * 
	 */
	public AbstractFactoryPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractFactory shapeFacory= FactoryProducer.getFactory("SHAPE");
		IShape circle= shapeFacory.getShape("Circle");
		circle.draw();
		
		
		
		AbstractFactory colorFacory= FactoryProducer.getFactory("COLOR");
		IColor color= colorFacory.getColor("Red");
		color.fill();
	}
	
}
