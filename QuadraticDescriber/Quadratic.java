import java.util.Scanner;

public class Quadratic {

		public static String quadrDescriber () {
			System.out.println("Welcome to the Quadratic Describer");
			System.out.println("Provide values for the scanners a, b, and c");
			Scanner scanner = new Scanner(System.in);
			double a = scanner.nextInt();
			System.out.println("a: "+a);
			double b = scanner.nextInt();
			System.out.println("b: "+b);
			double c = scanner.nextInt();
			System.out.println("c: "+c);
			System.out.println("Description of the graph of: ");
			System.out.println(a+" x^2 + "+ b +" x + "+c);
			if (a<0) System.out.println("Opens : Down");
			else System.out.println("Opens : Up");
			return("the method has ended.");
		}
		}
	



