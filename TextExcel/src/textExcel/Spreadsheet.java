package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int numRows;
	private int numCols;
	private Cell[][] cellArr;
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		if (command.contains("clear")) {
			if (command.equals("clear")) {
				clearAll(cellArr);
			}
		}
		return getGridText();
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return numRows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return numCols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return cellArr[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		String fullGrid = "   |";
		char c;
		for (char i = 'A'; i < 'M'; i++) {
			c = i;
			fullGrid+=c +"         |";
		}
		fullGrid+="\n";
		for (int i=0; i<20; i++) {
			fullGrid+=i+1+"";
			if (i>9) fullGrid+=" "; //accounts for when column of numbers is longer than 1
			fullGrid+="  |";
			for (int j=0; j<12; j++) {
				fullGrid+=cellArr[i][j].abbreviatedCellText()+"|";
			}
			fullGrid+="\n";
		}
		return fullGrid;
	}
	//constructor
	public Spreadsheet() {
		numRows=20;
		numCols=12;
		cellArr = new Cell[numRows][numCols];
		clearAll(cellArr);
	}
	public void clearAll(Cell[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				cellArr[i][j] = new emptyCell();
			}
		}
	}
}
