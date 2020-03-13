package textExcel;

public class TextCell implements Cell {
	private String text;
	@Override
	public String abbreviatedCellText() {
		String abbText = text;
		abbText+="          ";
		return abbText.substring(0,10);
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return ("\""+text+"\"");
	}
	public TextCell(String s) {
		String split = s.split("\"")[1];
		text=split;
//		text = s.substring(1,s.length()-1); make a substring ends with 1st quote then goes to 2nd quotes
	}
}
