package FPP.Lesson3.Lab3.assigment_4;

import FPP.Lesson3.Lab4.assigment2.closedcurve.good.Circle;
import FPP.Lesson3.Lab4.assigment2.closedcurve.good.Rectangle;
import FPP.Lesson3.Lab4.assigment2.closedcurve.good.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(1,1);
		Rectangle rect = new Rectangle(3,10);
		Circle circle = new Circle(8);
		
		System.out.println("Area of Triangle is " + triangle.computeArea());
		System.out.println("Area of Rectangle is " + rect.computeArea());
		System.out.println("Area of Circle is " + circle.computeArea());
		
		//using the side-side-side constructor of Triangle
		triangle = new Triangle(1,1,1.41421);
		System.out.println("Area of Triangle is " + Math.round(10*triangle.computeArea())/10.0);

	}

}
