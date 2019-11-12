/* Hans Mercado 
 * 21-10-19
 * Dreyer 3rd Period
 * 
 */
import java.util.Arrays;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*/String[] outputArray = "I like apples!".split(" ");
		System.out.println(Arrays.toString(outputArray));
		String[] outputArray2 = " really I really like really red apples!".split(" really ");
		System.out.println(Arrays.toString(outputArray2));
		//part 1 starts
		/*/
		String string = "applespineapplesbreadlettucetomatobaconmayohambreadcheese"; 
		String[] part1split = string.split("bread");
		String splitted = Arrays.toString(part1split);
		System.out.println(splitted);
		//if (string.charAt(0).equals('b'))
		System.out.println(string.charAt(0));
		if (string.indexOf("bread", string.indexOf("bread")+1) > -1) {
			System.out.println("damn son where'd you find this");
		}
		//NEW RESIN INSTRUCTIONS
		//get index of bread and return errything after bread, allowing filling to be array 1 always be ingredient because bread been split
		//if something bread or just bread, one array therefore no sandwich?
		//split it on bread get rid of spaces.
		
		
			//find if there are ingredients before bread
			//"mark" those indexed elements to not be put into the sandwhich string
			//concatenate array into a string
			//only in between 2 breads
	}

}
