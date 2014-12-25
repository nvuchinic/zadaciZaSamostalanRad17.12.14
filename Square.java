public class Square extends GeometricShape {

	/**
	 * Constructor method for creating instances of objects of this class, with
	 * parameter
	 * 
	 * @param a
	 */
	public Square(double a) {
		super(a);
	}

	/**
	 * override of method from superclass. This implementation calculates and
	 * returns the value of the area of square
	 */
	@Override
	public double calcArea() {
		return super.calcArea();
	}

	/**
	 * override of method from superclass. This implementation calculates and
	 * returns the value of the perimeter of square
	 */
	@Override
	public double calcPerimeter() {
		return 4 * super.getA();
	}

	/**
	 * override of the standard toString method.
	 */
	@Override
	public String toString() {
		String squareToString = "";
		squareToString = "Area of the square: " + calcArea()
				+ "\nPerimeter of the square: " + calcPerimeter();
		return squareToString;
	}
}
