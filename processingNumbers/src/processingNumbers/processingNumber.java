package processingNumbers;
import java.util.Scanner;
public class processingNumber {
	public static void main (String[] args) {
		processNum();
	}
	private static void processNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many nums? ");
		int nums = sc.nextInt();
		double min, max, maxE, number;
		double sum = 0;
		maxE = 0;
		System.out.print("1: ");
		double first = sc.nextDouble();
		if (first%2 == 0) {
			maxE = first;
			sum = first;
		}
		min = first; //the first number will always be both the minimum and maximum
		max = first;
		for (int i = 1; i < nums; i++) {
			System.out.print(i+1+": "); //shows which number is being done in the loop
			number = sc.nextDouble();
			if (number > max) {
				max = number; //determines if number is the new max, and if it is the new even max
				if (number%2 == 0) {
					maxE= number;
				}
			}
			if (number < min) min = number; //determines if number is the new min
			if (number%2==0) sum += number; //adds number to sum if even

		}
		sc.close();
		System.out.println("Largest even : "+maxE+ ", Largest : "+max+ ", Min : "+min+", Sum : "+sum);
	}
}
