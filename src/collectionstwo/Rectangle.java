package collectionstwo;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isARectangle = obj instanceof Rectangle;
		// Check for null
		if (obj == null || !isARectangle) {
			return false;
		}

		Rectangle other = (Rectangle) obj;

		return area() == (other.area());

	}
}
