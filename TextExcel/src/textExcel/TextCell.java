package textExcel;

public class TextCell implements Cell {
	private String text;
	@Override
	public String abbreviatedCellText() {
		String abbText = text+="          ";;
		return abbText.substring(0,10);
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return ("\""+text+"\"");
	}
	public TextCell(String s) {
		s=s.split("\"")[1];
		text=s;
	}
}
