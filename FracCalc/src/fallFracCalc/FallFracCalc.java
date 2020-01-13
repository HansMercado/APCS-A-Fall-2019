/*/ Hans Mercado
 * 6/12/19
 * 4th Period
 */
package fallFracCalc;

import java.util.Scanner;

public class FallFracCalc {

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
    	String[] pt1split = input.split(" "); //splits out the spaces, leaving the factors and operator
    	String factor1 = pt1split[0];
    	String operator = pt1split[1];
    	String factor2 = pt1split[2];
    	
    	//second operand code, also beginning of part 2
    	String[] part2split = factor2.split("_"); //separates whole number from fraction
    	String[] factor2Arr = {"0", "0", "1"};
    	String fraction2 = factor2;
    	if (factor2.contains("_")) { //separate whole number from fraction
    		factor2Arr[0] = part2split[0];
    		fraction2 = part2split[1];
    	}
    	if (factor2.contains("/")) { //separate numerator from denominator 
    		String [] fraction2Arr = fraction2.split("/");
    		factor2Arr[1] = fraction2Arr[0];
    		factor2Arr[2] = fraction2Arr[1];
    	}
    	else {
    		factor2Arr[0] = part2split[0];
    	}
    	///first operand, copy of second operand code
    	String[] part3split = factor1.split("_");
    	String[] factor1Arr = {"0", "0", "1"};
    	String fraction1 = factor1;
    	if (factor1.contains("_")) {
    		factor1Arr[0] = part3split[0];
    		fraction1 = part3split[1];
    	}
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
    	//initialize arrays for each factor so I can access each whole number, numerator, and denominator
    	int[] factor1Ints = {Integer.parseInt(factor1Arr[0]), Integer.parseInt(factor1Arr[1]), Integer.parseInt(factor1Arr[2])};
    	int[] factor2Ints = {Integer.parseInt(factor2Arr[0]), Integer.parseInt(factor2Arr[1]), Integer.parseInt(factor2Arr[2])};
    	int[] ansInts = new int[3];
    	//change to improper fractions
		factor1Ints=toImproperFracArray(factor1Ints);
    	factor2Ints=toImproperFracArray(factor2Ints);
    	
    	if (operator.contains("+") || operator.contains("-")) {
    		
    		if (factor1Ints[2]!=factor2Ints[2]) { //change to common denominator
    			factor1Ints[1] *= factor2Ints[2];
        		factor2Ints[1] *= factor1Ints[2];
        		factor1Ints[2] *= factor2Ints[2];
        		factor2Ints[2] = factor1Ints[2];
    		}
    		//System.out.println("we're working with "+factor1Ints[1]+"/"+factor1Ints[2] +" "+
    	      //  	factor2Ints[1]+"/"+factor2Ints[2]);
    		if (operator.contains("+")) {
    		ansInts[0] = factor1Ints[0] + factor2Ints[0];
    		ansInts[1] = factor1Ints[1] + factor2Ints[1];
    		}
    		if (operator.contains("-")) {
    		ansInts[0] = factor1Ints[0] - factor2Ints[0];
    		ansInts[1] = factor1Ints[1] - factor2Ints[1];
    		if ((ansInts[0]>0)&&(ansInts[1]<0)) {
    			ansInts[1]*=-1;
    		}
    		}
    		ansInts[2] = factor1Ints[2];
    	}
    	if (operator.contains("*") || operator.contains("/")){
        	//System.out.println("we're working with "+factor1Ints[1]+"/"+factor1Ints[2] +" "+
        	//factor2Ints[1]+"/"+factor2Ints[2]);
    		if (operator.contains("*")) {
        		ansInts[1] = factor1Ints[1]*factor2Ints[1];
        		ansInts[2] = factor1Ints[2]*factor2Ints[2];
        	}
        	if (operator.contains("/")) {
        		ansInts[1] = factor1Ints[1]*factor2Ints[2];
        		ansInts[2] = factor1Ints[2]*factor2Ints[1];
        		// 3/4 * -4/3 churns out 9/-14 at this point which I think is the reason for anti-anomaly #2
        	}
    	}
    	//System.out.println("before simplification "+ansInts[0] +"_"+ansInts[1]+"/"+ansInts[2]);
		ansInts[0] += ansInts[1]/ansInts[2];
		ansInts[1] = ansInts[1]%ansInts[2];
    	if (ansInts[1]==0) ansInts[2] = 1;
    	
    	if (ansInts[1] <= ansInts[2]) {
    		ansInts[0] += ansInts[1]/ansInts[2];
    		ansInts[1] = ansInts[1]%ansInts[2];
    		}
    	
    	if (ansInts[1]==0) ansInts[2] = 1;
    	if (ansInts[1]<0) { //anti-anomaly #1, I still don't know how this one happens tbh
    		if (ansInts[0]!=0) ansInts[1]*=-1;
		}
    	if (ansInts[2]<0) { //anti-anomaly #2, removes negative denominators, which happen in this code when...
    		//...the divisor's numerator is negative
    		ansInts[2]*=-1;
    		if (ansInts[0]==0) ansInts[1]*=-1;
		}
    	//gcf
    	int gcf = gcf(ansInts[1], ansInts[2]);
    	ansInts[1] /= gcf;
    	ansInts[2] /= gcf;
    	
    	//System.out.println("ansInts1 = "+ansInts[1]);
    	ans = ansInts[0] +"_"+ansInts[1]+"/"+ansInts[2];
    	if (ansInts[1]==0) ans = ans.substring(0, ans.indexOf("_")); 
    	if (ans.contains("0_")) ans=ans.substring(ans.indexOf("_")+1);
        return (ans);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int[] toImproperFracArray(int[] arr) { //modified toImproperFrac from calculate library, only works on 3 long arrs
		if (arr[0]*arr[1]<0) arr[1]*=-1;
    	arr[1]=arr[0]*arr[2]+arr[1];//numerator becomes whole number multiplied by denominator plus numerator
		arr[0]=0; //eliminates whole number
    	return (arr); 
	}
    public static boolean isDivisibleBy(int dividend, int divisor) {
		if (divisor<0) throw new IllegalArgumentException("This program cannot use a negative divisor.");
		if (dividend%divisor==0) { //dividend is either evenly divisible by the divisor or it ain't
			return(true);
		}else {
			return(false);
		}
	}
    public static double max(double num1, double num2) {
		if (num1>num2) { //returns the greatest input value. if they're equal, the maximum is still decided.
			return(num1);
		}else {
			return(num2);
		}
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
}
