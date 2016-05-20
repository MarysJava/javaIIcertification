package IV.generics.collections;

public class TestMethods {

//  Collections Methods
//	boolean add(Element elem) Adds elem into the underlying container.
//	void clear() Removes all elements from the container.
//	boolean isEmpty() Checks whether the container has any elements or not.
//	Iterator<Element> iterator() Returns an Iterator<Element> object for iterating over the container.
//	boolean remove(Object obj) Removes the element if obj is present in the container.
//	int size() Returns the number of elements in the container.
//	Object[] toArray() Returns an array that has all elements in the container.
	
//	boolean addAll( Collection<? extends
//			Element> coll)
//			Adds all the elements in coll into the underlying container.
//	boolean containsAll(Collection<?> coll) Checks if all elements given in coll are present in the underlying
//			container.
//	boolean removeAll(Collection<?> coll) Removes all elements from the underlying container that are
//			also present in coll.
//	boolean retainAll(Collection<?> coll) Retains elements in the underlying container only if they are also
//			present in coll; it removes all other elements.
	
//	boolean hasNext() Checks if the iterator has more elements to traverse.
//	next() Moves the iterator to the next element and returns that (next) element.
//	void remove() Removes the last visited element from the underlying container. next() should have been
//		called before calling remove(); otherwise it will throw an IllegalStateException.

//	boolean hasPrevious() Checks if the iterator has more elements to traverse in reverse direction.
//	Element previous() Moves the iterator to the next element and returns that (next) element in reverse direction.
//	int nextIndex() Returns the index of the next element in the iteration in forward direction.
//	int previousIndex() Returns the index of the next element in the iteration in reverse direction.
//	void set(Element) Sets the last element visited (using next or previous); it replaces the existing element.
//	void add(Element) Adds the element into the list at the current iteration position.

	
//	Method Short Description
//	void addFirst(Element) Adds the Element to the front of the Deque.
//	void addLast(Element) Adds the Element to the last of the Deque.
//	Element removeFirst() Removes an element from the front of the Deque and returns it.
//	Element removeLast() Removes an element from the last of the Deque and returns it.
//	Element getFirst() Returns the first element from the Deque, does not remove.
//	Element getLast() Returns the last element from the Deque, does not remove.

//	boolean offerFirst(Element) Adds the Element to the front of the Deque if it is not violating capacity constraint.
//	boolean offerLast(Element) Adds the Element to the end of the Deque if it is not violating capacity constraint.
//	Element pollFirst() Removes an element from the front of the Deque and returns it; if the Deque is
//		empty, it returns null.
//	Element pollLast() Removes an element from the end of the Deque and returns it; if the Deque is
//		empty, it returns null.
//		Element peekFirst() Returns the first element from the Deque but does not remove it; returns null
//	if Deque is empty.
//	Element peekLast() Returns the last element from the Deque but does not remove it; returns null
//		if Deque is empty.
	
//	List<T> asList(T . . . a) Creates a fixed-size List out of the given array.
//		int binarySearch(Object[] objArray,
//		Object key)
//		Search for key in objArray. Returns an int value >= (index of the key)
//		if found; otherwise it returns a negative value. Overloads available for
//		primitive types like int[], byte[], etc. Also, overload available for taking
//		a Comparator object.
//	boolean equals(Object[] objArray1,
//		Object[] objArray2)
//		Checks if the contents of objArray1 and objArray2 are equal. Overloads
//		available for primitive type arrays like int[], byte[], etc.
//	void fill(Object[] objArray, Object val) Fills the objArray with value val. Overloads available for primitive type
//		arrays like int[], byte[], etc.
//	void sort(Object[] objArray) Sorts the objArray based on the natural order (i.e., using the
//	compareTo() method). Overloads available for primitive type arrays like
//	int[], byte[], etc. Also an overload is available for taking a Comparator
//		object.
//	String toString(Object[] a) Returns the String representation of the given objArray. Overloads
//		available for primitive type arrays like int[], byte[], etc.

// STRING PROCESSING 
//	boolean startsWith(String prefixString,
//			int offset)
//		Starting from offset, check if this string has prefixString.
//	boolean startsWith(String prefixString) Check if this string has prefixString; equivalent to
//			startsWith(prefixString, 0);
//	boolean endsWith(String suffixString) Check if this string has the suffixString.

//	boolean regionMatches(int start,
//			String matchingStr, int matchStartOffset,
//			int matchLen)
//			Starting from start in this String object, check if the region
//			of text given by matchingStr matches. In matchStr, check for
//			matchLen characters starting from matchStartOffset.
//	boolean regionMatches(boolean ignoreCase,
//			int start, String matchingStr,
//			int matchStartOffset, int matchLen)
//			Same as the previous method, but with the additional first
//			argument, which ignores the case differences.
// valueOf
// parses
// split	
	
	
	
	public static void main(String[] args) {
		
	}
	
}
