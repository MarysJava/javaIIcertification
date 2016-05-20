package III.oo.principles.abstractfactory;

//Test.java
public class Test {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShape("Circle", "PrintFriendly");
		canvas.addNewShape("Rectangle", "PrintFriendly");
		canvas.redraw();
	}
}