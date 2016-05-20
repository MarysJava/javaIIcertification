package III.oo.principles.abstractfactory;

//DisplayFriendlyRectangle.java
public class DisplayFriendlyRectangle implements DisplayFriendlyShape {
	public DisplayFriendlyRectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("DisplayFriendlyRectangle constructor");
	}

	private int length, height;

	@Override
	public void draw() {
		System.out.println("DisplayFriendlyRectangle draw()");
		// draw() implementation
	}
}