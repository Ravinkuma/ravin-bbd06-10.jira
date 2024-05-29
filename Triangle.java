package com.java.practice40;

public class Triangle extends Shape {
            double s1,s2,s3;

			public Triangle(double s1, double s2, double s3) {
				super();
				this.s1 = s1;
				this.s2 = s2;
				this.s3 = s3;
			}
			@Override
			double calculateArea() {
				double s=(s1+s2+s3)/2;
				double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
				return area;
			}
}
