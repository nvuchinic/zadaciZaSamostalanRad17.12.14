public class Circle extends GeometricShape {
	private double radius;

	/**
	 * constructor method for creating new instances of this class
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
		//super(radius);  -------->instead of upper statement, we could just call superclass constructor
	}

	/**
	 * override of method from superclass. This implementation calculates and
	 * returns the value of the area of circle
	 */
	@Override
	public double calcArea() {
		return radius * radius * 3.14;
	}

	/**
	 * override of method from superclass. This implementation calculates and
	 * returns the value of the perimeter of circle
	 */
	@Override
	public double calcPerimeter() {
		return 2 * radius * 3.14;
	}

	/**
	 * override of the toString method . This implementation creates and returns
	 * the string representation of object of this class
	 */
	@Override
	public String toString() {
		String circleToString = "";
		circleToString = "Area of the circle: " + calcArea() + "\nPerimeter of the circle: "
				+ calcPerimeter();
		return circleToString;
	}
}
