package collectionstwo;

public class Circle {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		
		boolean isACircle = obj instanceof Circle;
		
		if(obj == null || !isACircle) {
			return false;
		}
		
		Circle theOther = (Circle) obj;
		
		return radius == theOther.radius;
	}

}
