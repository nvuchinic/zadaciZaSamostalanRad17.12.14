public class GeometricShape {
	private double a;

	/**
	 * Constructor method(default) for creating instances of objects of this class
	 */
	public GeometricShape() {
		a = 0;
	}

	/**
	 * Constructor method for creating instances of objects of this class, with
	 * parameter
	 * 
	 * @param a
	 */
	public GeometricShape(double a) {
		this.a = a;
	}

	public double calcArea() {
		return a * a;
	}

	public double calcPerimeter() {
		return a + a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	/*
	 * public String toString() { return " "; }
	 */
}
