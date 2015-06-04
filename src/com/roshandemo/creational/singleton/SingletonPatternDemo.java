package com.roshandemo.creational.singleton;

public class SingletonPatternDemo {

	public SingletonPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();
		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		object.setMsg("MSG1");
		SingleObject object1 = SingleObject.getInstance();
		object1.setMsg("MSG2");
		SingleObject object2 = SingleObject.getInstance();
		object2.setMsg("MSG3");
		SingleObject object3 = SingleObject.getInstance();
		object3.setMsg("MSG4");
		object.showMessage();
	}
}
