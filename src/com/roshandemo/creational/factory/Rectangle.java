/**
 * 
 */
package com.roshandemo.creational.factory;

/**
 * @author roshankumarm
 *
 */
public class Rectangle implements IShape {

	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.roshandemo.creational.factory.IShape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Crrating Rectangle");

		System.out
				.println("Crrating from com.roshandemo.creational.factory.Rectangle");
	}

}
