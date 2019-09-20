/*/Hans Mercado
 * August 29, 2019
 * Library of math functions
 * 
 */
public class Calculate {
	public static int square(int number) {
		return number*number; //Multiplies a number by itself.
	}
	public static int cube(int number) { //Multiplies that number by itself... then
		return number*number*number; //...multiplies the number by the original. 
	}
	public static double average(double number1, double number2) {
		return (number1 + number2)/2; //adds the two numbers together and then divides by 2.
	}

	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3; //adds the three numbers together and then divides by three.
	}
	public static double toDegrees(double radian) {
		double wholePi = (radian/3.14159);
		return wholePi*180; //this functions accepts fractions*pi, so 3pi/2 makes 3/2s of 180.
	}
	public static double toRadians(double degrees) {
		return (degrees/180*3.1415926); //for each 180 degrees, it returns the rounded pi
	}
	public static double discriminant(double A, double B, double C) {
		return ((B*B)-4*A*C); //B^2-4ac is the discriminant lol I wish I had paid attention and learned this when it was more relevant
	}
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		return (whole*denominator+numerator+"/"+denominator); //gets the whole number and multiplies it by the denominator, then adds it to the numerator. then adds the "/" and the denominator.
	}
	public static String toMixedNum(int numerator, int denominator) {
		return (numerator/denominator+"_"+numerator%denominator+"/"+denominator); //"numerator/denominator" returns the whole number, while "numerator%denominator" gets our remainder the rest of the return statement just includes the chars needed by the instructions.
	}
	public static String foil(int A, int B, int C, int D, String var) { //(ax+b)(cx+d) form. A and C are coefficients, B and D are the constants. Variable "var" replaces x.
		int finalA = A*C; //the "a" in ax^2+bx+c.
		int finalB = (A*D)+(C*B); //the "b" in ax^2+bx+c.
		int finalC = D*B; //the "c" in ax^2+bx+c
		return (finalA+var+"^2"+" + "+finalB+var+" + "+finalC); //puts em together or should i say CONCATENATES THEM
	}
	//start of part 2 ************************************************
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (dividend%divisor==0) { //dividend is either evenly divisible by the divisor or it ain't
			return(true);
		}else {
			return(false);
		}
	}
	public static double absValue(double num) {
		if (num<0) { //eliminate negative numbers
			num=num*-1;
		}
		return(num);
		}
	public static double max(double num1, double num2) {
		if (num1>num2) { //returns the greatest input value. if they're equal, the maximum is still decided.
			return(num1);
		}else {
			return(num2);
		}	
	}
	public static double max(double num1, double num2, double num3) {
		if (num1>=num2&&num1>=num3) {
			return(num1);
		}else if (num2>=num1&&num2>=num3) {
			return(num2);
		}else if (num3>=num1&&num3>=num2) {
			return(num3);
		}else {
			return(num1);
		}
	}
	public static double min(double num1, double num2) {
		if (num1<num2) {
			return(num1);
		}else {
			return(num2);
		}
	}
	public static double round2(double num1) { //visualize 0.555 and 0.554
		num1=((num1+.005)*100);
		num1 = (int) num1;
		return(num1/100);
	}
	//start of part3 ****************************************************
	public static double exponent(double num, int power) {
		double ans = num;
		for (int i=1;i!=power;i++) {
			ans=(ans*num);
		}
		return(ans);
	}
	public static int factorial(int num) {
		int ans=1;
		for (int i=2; i < num+1; i++) {
			ans=ans*i;
		}
		return ans;
	}
	public static boolean isPrime(int num) {
		boolean result=true;
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				result=false;
			}
		}
		return result;
	}
	public static int gcf(int num1, int num2) {
		int largerNumber = (int) max(num1, num2);
		int ans = 1;
		for (int i=1; i < largerNumber; i++) {
			if (isDivisibleBy(num1, i)) {
				if (isDivisibleBy(num2, i)) {
					ans=i;
				}
			}
		}
		return ans;
	}
	public static double sqrt(double num) {
	double educatedGuess = num/2.;
	for (int i = 0; i < 20; i++) {
		educatedGuess = (num/educatedGuess+educatedGuess)/2;
	}
	int ans = (int) (((educatedGuess+.005)*100)/100);
		return (double) ans;
	}
	
}

