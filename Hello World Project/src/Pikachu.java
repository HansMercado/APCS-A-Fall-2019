/* 3rd Period APCS Class Composite
 * 8-26-19
 * Hans Mercado 
 * Draws a Pikachu using escape sequences.
 */
public class Pikachu { //class header

	public static void main(String[] args) {
		printPikachu();
		drawBox();
		System.out.println();
		drawBox();
		System.out.println();
		drawBox();
		System.out.println();
	}
	public static void printPikachu() {

		System.out.println("Pikachu welcomes you to the World of Pokemon!");
		System.out.println("\t\t\t  (\\__/)");
		System.out.println("\t\t\t  (o^.^)");
		System.out.println("\t\t\tz(_(\")(\"))");
	}
	public static void plusMinusPlus() {
		System.out.println("+----------+");
		
	}
	public static void twoVerticalLines() {
		System.out.println("|          |");
	}
	public static void drawBox() {
		plusMinusPlus();
		twoVerticalLines();
		twoVerticalLines();
		twoVerticalLines();
		twoVerticalLines();
		plusMinusPlus();
	}
}
