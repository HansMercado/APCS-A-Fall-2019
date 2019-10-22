/* Hans Mercado 
 * 21-10-19
 * Dreyer 3rd Period
 * 
 */
import java.util.Arrays;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] outputArray = "I like apples!".split(" ");
		System.out.println(Arrays.toString(outputArray));
		String[] outputArray2 = " really I really like really red apples!".split(" really ");
		System.out.println(Arrays.toString(outputArray2));
		String[] part1split = "applespineapplesbreadlettucetomatobaconmayohambreadcheese".split("bread");
		part1split = Arrays.toString(part1split).split("mayo");
		
			//concatenate array into a string
			//only in between 2 breads
	}

}
