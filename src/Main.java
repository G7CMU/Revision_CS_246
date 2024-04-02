
public class Main {

	public static void main(String[] args) {
		System.out.println("10 to binary: ");
		BaseN.toBinary(10);
		System.out.println("Circle Area: ");
		ShapeCalculator.circleArea(12);
		System.out.println("1 + 2: ");
		Calc.sum(1, 2);
		System.out.println("3x^2 + 3x - 2 = 0: ");
		EquationSolver.quadraticEquation(3, 4, -2);
	}

}
