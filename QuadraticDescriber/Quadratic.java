import java.util.Scanner;

public class Quadratic {
	//all the methods imported from calculate class
	public static double sqrt(double num) {
		if (num<0)throw new IllegalArgumentException("This method cannot find the square root of a ngeative number.");
		double educatedGuess = num/2;
		for (int i = 0; i < 5; i++) {
			educatedGuess = (num/educatedGuess+educatedGuess)/2;
		}
		int ans = (int) (((educatedGuess+.005)*100)/100);
		return ans;
		}
	public static double exponent(double num, int power) {
		if (power<0) throw new IllegalArgumentException("This method cannot evaluate negative or fractional exponents.");
		double ans = num;
		for (int i=1;i!=power;i++) {
			ans=(ans*num);
		}
		return(ans);
	}
	public static double discriminant(double A, double B, double C) {
		return ((B*B)-4*A*C); //B^2-4ac is the discriminant lol I wish I had paid attention and learned this when it was more relevant
	}
	public static double round2(double num1) { //visualize 0.555 and 0.554
		num1=((num1+.005)*100);
		num1 = (int) num1;
		return(num1/100);
	}
	public static String quadForm(double a, double b, double c) {
		//negative b plus or minus the square root of b squared minus 4ac all over 2a
		double root1 = (	(-1*b)	+	(sqrt	( exponent(b, 2)	-(4*a*c)	)))	/2*a;
		double root2 = (	(-1*b)	-	(sqrt	( exponent(b, 2)	-(4*a*c)	)))	/2*a;
		if (discriminant(a, b, c)<0) return ("No real roots.");
		if (discriminant(a, b, c)==0) {
		return (round2(root1)+"");
		}
		else {
		return (root1 + " and " + root2);
		}
	}
	public static double axisOfSymmetry(double a, double b, double c) { //modified from quadForm()
		//negative b plus or minus the square root of b squared minus 4ac all over 2a
		double root1 = (	(-1*b)	+	(sqrt	( exponent(b, 2)	-(4*a*c)	)))	/2*a;
		double root2 = (	(-1*b)	-	(sqrt	( exponent(b, 2)	-(4*a*c)	)))	/2*a;
		if (root1==root2) return(root1);
		else return((root1+root2)/2);
	}
	public static String vertex (double a, double b, double c) {
		double x = axisOfSymmetry(a, b, c); //returns a string including the x-value and y-value
		double y = a*(x*x) + b*x + c;
		return ("("+x+" "+y+")"); //takes x value from axis of symmetry method
	}
	public static String xIntercepts(double a, double b, double c) { //derived from quadForm once again
		double root1 = (	(-1*b)	+	(sqrt	( exponent(b, 2)	-(4*a*c)	)))	/2*a;
		double root2 = (	(-1*b)	-	(sqrt	( exponent(b, 2)	-(4*a*c)	)))	/2*a;
		if (root1 == root2) { 
			return (root1+"");
		}
		else return (root1 +" and "+root2);
	}
	public static double yIntercept (double a, double b, double c) {
		return (a*(0*0) + b*0 + c); //vertex() but it plugs in 0
	}
	//cool part 5 starts here
	public static void quadrDescriber () { //I can probably make this easier by making the method accept variables
		while (true) {
			System.out.println("Welcome to the Quadratic Describer");
			System.out.println("Provide values for the scanners a, b, and c");
			Scanner scanner = new Scanner(System.in);
			//scanners get int's, can be separated by spaces like "1 0 0" for 1 0 and 0
			double a = scanner.nextInt();
			System.out.println("a: "+a);
			double b = scanner.nextInt();
			System.out.println("b: "+b);
			double c = scanner.nextInt();
			System.out.println("c: "+c);
			System.out.println("Description of the graph of: ");
			System.out.println(a+" x^2 + "+ b +" x + "+c);
			if (a<0) System.out.println("Opens : Down"); //checks if a value is negative
			else System.out.println("Opens : Up");
			System.out.println("Axis of Symmetry : "+axisOfSymmetry(a,b,c));
			System.out.println("Vertex : " + vertex(a,b,c));
			System.out.println("x-intercept(s) : "+xIntercepts(a,b,c));
			System.out.println("y-intercept : "+yIntercept(a,b,c));
			System.out.println("");
			System.out.print("Do you want to keep going? (type \"quit\" to end)");
			Scanner end = new Scanner(System.in);
			if (end.next() == "quit") {
				break;
			}
	}
}
}


