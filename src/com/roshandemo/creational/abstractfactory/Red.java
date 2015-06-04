/**
 * 
 */
package com.roshandemo.creational.abstractfactory;

/**
 * @author roshankumarm
 *
 */
public class Red implements IColor {

	/**
	 * 
	 */
	public Red() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.roshandemo.creational.abstractfactory.IColor#fill()
	 */
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Crrating Red");

		System.out
				.println("Crrating from com.roshandemo.creational.abstractfactory.Red");
	}

}
