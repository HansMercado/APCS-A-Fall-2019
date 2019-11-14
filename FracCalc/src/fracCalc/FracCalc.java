package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	// TODO: initiate scanner, do basic method that shows that it took input from the scanner, close the loop
    	// TODO: split the input into 2 factors and the operator
    	Scanner sc = new Scanner(System.in);
    	boolean done = false;
    	while (done==false) {
    		System.out.print("Input please ");
        	System.out.println(produceAnswer(sc.nextLine()));
        	System.out.println("Do you want to keep going? (type \"quit\" to end)");
			if (sc.nextLine().equals("quit")) done = true;
    	}
    	sc.close();
    	System.out.println("main method done.");
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String[] pt1split = input.split(" ");
    	String factor1 = pt1split[0];
    	String operator = pt1split[1];
    	String factor2 = pt1split[2];
    	//do this for both operands!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    	String[] part2split = factor2.split("_");
    	String[] factor2Arr = {"0", "0", "1"};
    	String fraction2 = "";
    	if (factor2.contains("_")) {
    		factor2Arr[0] = part2split[0];
    		fraction2 = part2split[1];
    	} else fraction2 = factor2;
    	
    	if (factor2.contains("/")) {
    		String [] fraction2Arr = fraction2.split("/");
    		factor2Arr[1] = fraction2Arr[0];
    		factor2Arr[2] = fraction2Arr[1];
    	}
    	else {
    		factor2Arr[0] = part2split[0];
    	}
    	///first operand
    	String[] part3split = factor1.split("_");
    	String[] factor1Arr = {"0", "0", "1"};
    	String fraction1 = "";
    	if (factor1.contains("_")) {
    		factor1Arr[0] = part3split[0];
    		fraction1 = part3split[1];
    	} else fraction1 = factor1;
    	
    	if (factor1.contains("/")) {
    		String [] fraction1Arr = fraction1.split("/");
    		factor1Arr[1] = fraction1Arr[0];
    		factor1Arr[2] = fraction1Arr[1];
    	}
    	else {
    		factor1Arr[0] = part3split[0];
    	}
    	//part 3 begins
    	String ans = "";
    	int[] factor1Ints = {Integer.parseInt(factor1Arr[0]), Integer.parseInt(factor1Arr[1]), Integer.parseInt(factor1Arr[2])};
    	int[] factor2Ints = {Integer.parseInt(factor2Arr[0]), Integer.parseInt(factor2Arr[1]), Integer.parseInt(factor2Arr[2])};
    	int[] ansInts = {0, 0, factor1Ints[2]};
    	factor1 = toImproperFrac(factor1Ints[0], factor1Ints[1], factor1Ints[2]);
    	factor2 = toImproperFrac(factor2Ints[0], factor2Ints[1], factor2Ints[2]);
    	if (input.contains("+") || input.contains("-")) {
    		factor2Ints[1] *= factor1Ints[2];
    		factor2Ints[2] *= factor1Ints[2];
    		//AAAAAAAAAAAAAAAAAAAAAAAAAAA COMMON FACTOR OR JUST TIMES THEM
    		ansInts[0] = factor1Ints[0] + factor2Ints[0];
    		ansInts[1] = factor1Ints[1] + factor2Ints[1];
    	}
        return ("whole:"+ansInts[0] +" numerator:"+ansInts[1]+" denominator:"+ansInts[2]);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String toImproperFrac(int whole, int numerator, int denominator) {
		return (whole*denominator+numerator+"/"+denominator); //gets the whole number and multiplies it by the denominator, then adds it to the numerator. then adds the "/" and the denominator.
	}
}
