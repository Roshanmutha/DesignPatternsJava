/**
 * 
 */
package com.roshandemo.creational.factory;

/**
 * @author roshankumarm
 *
 */
public class Circle implements IShape {

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.roshandemo.creational.factory.IShape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Crrating Circle");

		System.out
				.println("Crrating from com.roshandemo.creational.factory.Circle");
	}

}
