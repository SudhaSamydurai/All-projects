package Sample2;

public class TestFactory {

	public static void main(String[] args) {

		Shape shape = ShapeFactory.getShape("Circle");
		System.out.println(shape);
	}

}
