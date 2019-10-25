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
		for (String ingredients: part1split) {
			System.out.println(ingredients);
		}
		//NEW RESIN INSTRUCTIONS
		//get index of bread and return errything after bread, allowing filling to be array 1 always be ingredient because bread been split
		//if something bread or just bread, one array therefore no sandwich?
		
		
			//find if there are ingredients before bread
			//"mark" those indexed elements to not be put into the sandwhich string
			//concatenate array into a string
			//only in between 2 breads
	}

}
