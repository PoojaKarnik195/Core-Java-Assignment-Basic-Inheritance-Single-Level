
package com.capgemini.singlelevel;

//child class constructor created
class Child extends Parent {

	int j;

	// constructor with 2 parameters inherits common properties from base class
	Child(int i, int j) {
		super(i);
		this.j = j;
		System.out.println("This is Child class");
	}
}
