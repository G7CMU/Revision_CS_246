
public class ShapeCalculator {
	public static void cỉclePerimeter(double r) {
		double p = Math.PI * r * 2;
		
		System.out.println("Perimeter = " + p);
	}
	
	public static void circleArea(double r) {
		double a = Math.PI * Math.pow(r,  2);
		
		System.out.println("Area = " + a);
	}
	
	public static void rectangleArea(double side1, double side2) {
		double a = side1 * side2;
		
		System.out.println("Area = " + a);
	}
	
	public static void rectanglePerimeter(double side1, double side2) {
		double p = (side1 + side2) * 2;
		
		System.out.println("Perimeter = " + p);
	}
}
