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
		return "";
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
		for (char i = 'A'; i < 'L'; i++) {
			c = i;
			fullGrid+=c +"         ";
		}
		fullGrid+="\n";
		for (int i=0; i<20; i++) {
			//fullGrid
		}
		return fullGrid;
	}
	//constructor
	public Spreadsheet() {
		numRows=20;
		numCols=12;
		Cell[][] cellArr = new Cell[numRows][numCols];
		for (int i = 0; i < cellArr.length; i++) { //move to a new method
			for (int j = 0; j < cellArr[1].length; j++) {
				cellArr[i][j] = new emptyCell();
			}
		}
	}
}
