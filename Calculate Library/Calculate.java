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
		
		return (3);
	}
}
/*/wholePi = (radian/3.14159)*180; //the idea is to get every whole number of pi and get 180 degrees
		double remainderPi = (radian%3.14159)*180; //gets remainder from pi, gets some degrees
		double result = wholePi*180+remainderPi*180; //just adds the degrees from both
		return (3); //looks for a radian in terms of pi, so 3/4 pi will be 3/4 of 180 degrees./*/
