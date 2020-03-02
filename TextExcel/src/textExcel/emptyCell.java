package textExcel;

public class emptyCell implements Cell {
	String text;
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return text;
	}
	public emptyCell() {
		text="";
	}
}
