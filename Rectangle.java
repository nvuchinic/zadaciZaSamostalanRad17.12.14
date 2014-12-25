public class Rectangle extends GeometricShape {
	private double width;
	private double height;

	/**
	 * Constructor method for creating instances of objects of this class, with
	 * parameters
	 * 
	 * @param width
	 * @param height
	 */

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * override of method from superclass. This implementation calculates and
	 * returns the value of the area of rectangle
	 */
	@Override
	public double calcArea() {
		return width * height;
	}

	/**
	 * override istoimene metode iz superklase. This implementation calculates
	 * and returns the value of the perimeter of rectangle
	 */
	@Override
	public double calcPerimeter() {
		return 2 * (width * height);
	}

	/**
	 * override of toString method.
	 */
	@Override
	public String toString() {
		String rectToString = "";
		rectToString = "Area of the rectangle: " + calcArea()
				+ "\nPerimeter of the rectangle: " + calcPerimeter();
		return rectToString;
	}

}
