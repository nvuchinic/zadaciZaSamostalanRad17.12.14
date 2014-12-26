public class ComplexShape extends GeometricShape {
	GeometricShape[] shapes;
	private int numOfShapes;

	/**
	 * Constructor method for creating instances of objects of this class. It
	 * creates the array of objects of GeometricShape type;
	 */
	public ComplexShape() {
		shapes = new GeometricShape[5];
		for (int i = 0; i < 5; i++) {
			shapes[i] = new GeometricShape();
		}
	}

	public int getNumOfShapes() {
		return numOfShapes;
	}

	public void setNumOfShapes(int numOfShapes) {
		this.numOfShapes = numOfShapes;
	}

	/**
	 * method for adding new objects of GeometricShape type
	 * @param shape
	 */
	public void addShape(GeometricShape shape) {
		if (numOfShapes == shapes.length) {
			resizeShapes();
		}
		shapes[numOfShapes] = shape;
		numOfShapes++;
	}

	

	
	/**
	 * Method for resizing(2x)  the array of GeometricShape type
	 * @return
	 */
	public GeometricShape[] resizeShapes() {
		int size = shapes.length * 2;
		GeometricShape[] temp = new GeometricShape[size];
		for (int i = 0; i < size; i++) {
			temp[i] = new GeometricShape();
		}
		for (int i = 0; i < numOfShapes; i++) {
			temp[i] = shapes[i];
		}
		shapes = temp;
		return shapes;
	}

/**
	 * method for adding objects of ComplexShape type to existing array of
	 * ComplexShape objects with varargs functionality (we can pass any number
	 * of ComplexShape objects as parameters,even none
	 * @param complexShapes
	 */
	public void addVarShapes(ComplexShape... complexShapes) {
		for (int i = 0; i < complexShapes.length; i++) {
			if (numOfShapes == shapes.length) {
				resizeShapes();
			}
			shapes[numOfShapes] = complexShapes[i];
			numOfShapes++;
			// if (numOfShapes == shapes.length) {
			// resizeShapes();
			// }
		}
	}



	/**
	 *method for adding  array of objects of GeometricShape type
	 * @param shapes2
	 */
	public void addShapes(GeometricShape[] shapes2) {
		for (int i = 0; i < shapes2.length; i++) {
			if (numOfShapes == shapes.length) {
				resizeShapes();
			}
			shapes[numOfShapes] = shapes2[i];
			numOfShapes++;
			if (numOfShapes == shapes.length) {
				resizeShapes();
			}
		}
	}

	/**
	 * override of method from superclass.
	 * This implementation calculates and returns sum of areas of all the objects array of GeometricShape type consists of
	 */
	@Override
	public double calcArea() {
		double area = 0;
		for (int i = 0; i < numOfShapes; i++) {
			area += shapes[i].calcArea();
		}
		return area;
	}

	/**
	 * override of toString method. Kreira 
	 */
	public String toString() {
		String shapesToString = "KOMPLEX SHAPE:\n______________________________";
		for (int i = 0; i < numOfShapes; i++) {
			shapesToString += "\n" + "\nSHAPE " + (i + 1) + "\n"
					+ shapes[i].toString() + "\n";
		}
		return shapesToString;
	}

}
