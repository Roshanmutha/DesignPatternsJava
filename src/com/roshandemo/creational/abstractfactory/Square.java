/**
 * 
 */
package com.roshandemo.creational.abstractfactory;

/**
 * @author roshankumarm
 *
 */
public class Square implements IShape {

	/**
	 * 
	 */
	public Square() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.roshandemo.creational.factory.IShape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Crrating Square");

		System.out
				.println("Crrating from com.roshandemo.creational.factory.Square");
	}

}
