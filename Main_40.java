package com.java.practice40;
import java.util.*;


public class Main_40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		SortInAscending sa=new SortInAscending();
		sa.arraySorting(a, n);
		
		SortInDesc sd=new SortInDesc();
		sd.sortInDescOrder(a, n);
		
		
		FrequencyOfEachNo f=new FrequencyOfEachNo();
		f.frequencyOfEachNo(a, n);
		
		Animal obj= new Animal();
		obj.makeSound();
		Animal obj1= new Dog();// Dog obj1=
		obj1.makeSound();
		Animal obj2=new Cat();
		obj2.makeSound();
		
		
		Shape c=new Circle(5.6); // Circle c=
 	    System.out .println("Area of circle1 "+c.calculateArea());
 	    
 	    Circle c2=new Circle(7.5); 
	    System.out .println("Area of circle2 "+c2.calculateArea());
	    
	   Triangle t1=new Triangle(5.5,6,7);
 	   System.out .println("Area of triangle1 "+String.format("%.2f",t1.calculateArea()));
 	   Shape t2=new Triangle(7.7,6,7.5);
	   System.out .println("Area of triangle2 "+String.format("%.2f",t2.calculateArea()));
		
		Printable p=new Documents();// Documents d=new Documents();
		p.printing();
		
		Image i=new Image();
		i.printing();
	}

}
