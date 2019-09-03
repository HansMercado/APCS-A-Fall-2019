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
	public static double average(double number1, double number2) {
		return (number1 + number2)/2;
	}

	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	}
	public static double toDegrees(double radian) {
		return radian*180; //this functions accepts fractions*pi, so 3pi/4 makes 3/4s of 180.
	}
	public static double toRadians(double degrees) {
		return (3/4);
	}
}
/*/wholePi = (radian/3.14159)*180; //the idea is to get every whole number of pi and get 180 degrees
		double remainderPi = (radian%3.14159)*180; //gets remainder from pi, gets some degrees
		double result = wholePi*180+remainderPi*180; //just adds the degrees from both
		return (3); //looks for a radian in terms of pi, so 3/4 pi will be 3/4 of 180 degrees./*/
