public class EquationSolver {
	public static void linearEquation(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Infinite solutions");
			} else {
				System.out.println("No solution");
			}
		} else {
			System.out.println("x = " + (-b/a));
		}
	}
	
	public static void quadraticEquation(double a, double b, double c) {
		if (a == 0) { // Linear Equation
			if (a == 0) {
				if (b == 0) {
					System.out.println("Infinite solutions");
				} else {
					System.out.println("No solution");
				}
			} else {
				System.out.println("x = " + (-b / a));
			}
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			
			if (delta < 0) {
				System.out.println("No solution");
			}
			
			if (delta == 0) {
				System.out.println("x1 = x2 = " + (-b / 2 * a));
			}
			
			if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}