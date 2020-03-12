package textExcel;

//import java.io.FileNotFoundException;
import java.util.Scanner;
// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
	    // Add your command loop here
		boolean active = true;
		Scanner sc = new Scanner(System.in);
		Spreadsheet sheet = new Spreadsheet();
		while (active) {
			System.out.println(sheet.processCommand(sc.nextLine()));
			if (sc.nextLine().equals("quit")) {
				active = false;
			}
		}
		sc.close();
	}
}
