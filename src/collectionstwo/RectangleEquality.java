package collectionstwo;

public class RectangleEquality {

	public static void main(String[] args) {

		Rectangle firstRectangle = new Rectangle(10, 14);
		Rectangle secondRectangle = new Rectangle(10, 17);

		Object asObject = firstRectangle;
		System.out.println("Is an Rectangle?" + (asObject instanceof Rectangle));

		if (asObject.equals(secondRectangle)) {
			System.out.println("These are the same size");
		} else {
			System.out.println("These aren't the same size.");
		}
	}
}
