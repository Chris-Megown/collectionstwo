package collectionstwo;

public class CircleEquality {

	public static void main(String[] args) {
		Circle firstCircle = new Circle(42);
		Circle secondCircle = new Circle(42);

		Object asObject = firstCircle;
		System.out.println("Is an Object?" + (asObject instanceof Object));
		System.out.println("Is an Circle?" + (asObject instanceof Circle));
		System.out.println("Is a String?" + (asObject instanceof String));

		if (firstCircle.equals(secondCircle)) {
			System.out.println("These are the same size");
		} else {
			System.out.println("These aren't the same size.");
		}
	}

}
