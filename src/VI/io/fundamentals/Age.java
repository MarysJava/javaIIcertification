package VI.io.fundamentals;

import java.io.Serializable;

public class Age implements Serializable {

	private static final long serialVersionUID = 3849835260275276360L;
	
	private int age;
	
	public Age(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.valueOf(age);
	}
}
