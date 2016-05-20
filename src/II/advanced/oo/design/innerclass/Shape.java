package II.advanced.oo.design.innerclass;

public class Shape {

	/*
	 * There are four types or flavors of nested classes in Java: • Static
	 * nested class • Inner class • Local inner class • Anonymous inner class
	 */

	 static public class Color {
		int m_red, m_green, m_blue;

		public Color() {
			// call the other overloaded Color constructor by passing default
			// values
			this(0, 0, 0);
		}

		public Color(int red, int green, int blue) {
			m_red = red;
			m_green = green;
			m_blue = blue;
		}

		public String toString() {		
			return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
		}

		// other color members elided
	}
	// other Shape members elided
}
