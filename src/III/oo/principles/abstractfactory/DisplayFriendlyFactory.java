package III.oo.principles.abstractfactory;

//DisplayFriendlyFactory.java
public class DisplayFriendlyFactory implements ShapeFactory {
	@Override
	public Shape getShape(String sourceType) {
		switch (sourceType) {
		case "Circle":
			return new DisplayFriendlyCircle(10, 10, 20);
		case "Rectangle":
			return new DisplayFriendlyRectangle(10, 20);
		}
		return null;
	}
}