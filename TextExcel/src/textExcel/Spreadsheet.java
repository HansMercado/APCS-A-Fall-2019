package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	int numRows;
	int numCols;
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
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}
	//constructor
	public Spreadsheet() {
		Cell[][] cellArr = new Cell[numRows][numCols];
		for (int i = 0; i < cellArr.length; i++) {
			for (int j = 0; j < cellArr[1].length; j++) {
				cellArr[i][j] = new emptyCell();
			}
		}
	}
}
