package IX.exceptions.assertions;

class AssertionExample1 {
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE; //Because range of integers, min integer is not possible to have a same positive, max_integer is like "min integer" positive -1
		if (i < 0) {
			// if negative value, convert into positive value
			i = -i;
		}
		System.out.println("the value of i is: " + i);
		// at this point the assumption is that i cannot be negative;
		// assert this condition since its an assumption that will always hold
		assert (i >= 0) : "impossible: i is negative!";
	}
}