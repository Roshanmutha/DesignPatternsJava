package com.roshandemo.creational.singleton;

public class SingleObject {

	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	private String msg;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		showMessage();
		this.msg = msg;
		showMessage();
	}

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println(msg);
	}

}
