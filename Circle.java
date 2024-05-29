package com.java.practice40;

public class Circle extends Shape {
	double radius;
 public Circle(double radius) {
	 this.radius=radius;
 }
 @Override
	double calculateArea() {
		return 3.14*radius*radius;    //Math.PI
	}
}

