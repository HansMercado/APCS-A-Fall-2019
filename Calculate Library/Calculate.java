/*/Hans Mercado
 * August 29, 2019
 * Library of math functions
 * 
 */
public class Calculate {
	public static int square(int number) {
		return number*number;
	}
	public static int cube(int number) {
		return number*number*number;
	}
	public static double average(double number1, double number2, double number3) {
		return (number1+number2+number3)/3;
	}
	public static double toDegrees(double radian) {
		return radian/3.14159*180; //pi is 180 degrees, so this works in terms of pi
	}
}

