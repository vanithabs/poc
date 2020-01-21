package com.poc;

class Car extends Vehicle {

	void drive() {
		super.drive();
		System.out.println("DriveSubClass");
	}

	public boolean equals(Car other) {
		return false;
	}

}
