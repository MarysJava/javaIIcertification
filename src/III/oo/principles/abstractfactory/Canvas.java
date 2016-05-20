package III.oo.principles.abstractfactory;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();

	public void addNewShape(String shapeType, String factory) {

		Shape shape = null;
		ShapeFactory sfactory = null;

		switch (factory) {
		case "DisplayFriendly":
			sfactory = new DisplayFriendlyFactory();
			break;
		case "PrintFriendly":
			sfactory = new PrinterFriendlyFactory();
			break;
		}
		shape = sfactory.getShape(shapeType);
		shapeList.add(shape);
	}

	public void redraw() {
		Iterator<Shape> itr = shapeList.iterator();
		while (itr.hasNext()) {
			Shape shape = itr.next();
			shape.draw();
		}
	}
}