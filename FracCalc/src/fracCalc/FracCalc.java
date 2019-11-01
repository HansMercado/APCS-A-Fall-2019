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
        return (factor2);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
