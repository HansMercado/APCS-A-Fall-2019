/*/Hans Mercado
 * APCS Period 3
 * August 29, 2019
 * Call the code from the Calculate class
 * (aka client or runner code)
 */
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("yeehaw");
			System.out.println("square :"+Calculate.square(9));
			System.out.println("cube :"+Calculate.cube(2));
			System.out.println("average :"+Calculate.average(3, 2));
			System.out.println(Calculate.average(3, 1, 2));
			System.out.println(Calculate.toDegrees(3.14159));
			System.out.println(Calculate.toRadians(360));
			System.out.println(Calculate.discriminant(1, -8, 16));
			System.out.println(Calculate.toImproperFrac(1, 2, 9));
			System.out.println(Calculate.toMixedNum(15, 2));
			System.out.println(Calculate.foil(2, 3, 6, -7, "g(x)"));
			System.out.println(Calculate.foil(1, 0, 1, 0, "h(x)")); //might come back and get rid of the 0 stuff later
			//start of part 2 ********************************
			System.out.println(Calculate.isDivsibleBy(72, 91));
			System.out.println(Calculate.absValue(-9000.1));
			System.out.println(Calculate.max(2, 3));
			System.out.println(Calculate.max(2, 3, 3));
			System.out.println(Calculate.min(700, 701));
			System.out.println(Calculate.round2(.554));
			System.out.println(Calculate.round2(.555));
			//start of part 3 ********************************
			System.out.println(Calculate.exponent(2, 10));
			
	}
}