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
		if (command.contains("clear")) {
			//clear all of it.
			if (command.equals("clear")) {
				clearAll(cellArr);
			} else { //clear a cell specified.
				SpreadsheetLocation  loc = new SpreadsheetLocation(command.substring(6));
				cellArr[loc.getRow()][loc.getCol()] = new emptyCell();
				//this is where the "clear " of "clear A1" ends. 
			}
		}
		if (command.contains("=")) {
			SpreadsheetLocation  loc = new SpreadsheetLocation(command.substring(0,command.indexOf("=")-1));
			//if it's an assignment it'll have the equals sign
			cellArr[loc.getRow()][loc.getCol()] = new TextCell(command.substring(5));
		}
		if (command.length()<4) {
			SpreadsheetLocation  loc = new SpreadsheetLocation(command);
			return (cellArr[loc.getRow()][loc.getCol()].fullCellText());
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
			if (i<9) fullGrid+=" "; //accounts for when column of numbers is longer than 1
			fullGrid+=" |";
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
