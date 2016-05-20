package III.oo.principles.abstractfactory;

//PrinterFriendlyRectangle.java
public class PrinterFriendlyRectangle implements PrinterFriendlyShape {
	public PrinterFriendlyRectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("PrinterFriendlyRectangle constructor");
	}

	private int length, height;

	@Override
	public void draw() {
		System.out.println("PrinterFriendlyRectangle draw()");
		// draw() implementation
	}
}