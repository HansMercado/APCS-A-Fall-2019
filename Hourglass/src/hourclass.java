
public class hourclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//line 0
		System.out.print("|");
		reprinter(10, "\"");
		System.out.println("|");
		//upper lines
		for (int row = 1; row <= 4; row++) {
			reprinter(row, " ");
			System.out.print("\\");
			reprinter(-2*row+10, ":");
			System.out.println("/");
		}
		//middle line
		System.out.println("     ||");
		//lower lines
		for (int row = 1; row <= 4; row++) {
			reprinter(-row+5, " ");
			System.out.print("/");
			reprinter(2*row, ":");
			System.out.println("\\");
		}
		//last line
		System.out.print("|");
		reprinter(10, "\"");
		System.out.println("|");
	}
	public static void reprinter(int times, String character ) {
	for (int i = 0; i < times; i++) {
		System.out.print(character);
	}
	}

}
