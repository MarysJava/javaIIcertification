package II.advanced.oo.design.innerclass;

import II.advanced.oo.design.innerclass.Circle.Point;

public class Test extends Shape.Color {

	final int x;
	
	public Test() {
		x=0;	
	}
	
	public Test(int y) {
		x=y;
	}
	
	public static void main(String[] args) {
		Point p = null; //new Circle(0,0,0).new Point(0,0); //SINTAXE IMPORTANTE!
		//Create inner class Point from outerClassObject.new 
		
	}
}
