package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	/*/charAt0 char for Col
	 * use Substring 1 for string for Row
	 * String row = parseInt
	 * -1 -> index for row
	 * char col -> charAt - A
	 */
	private int row;
	private int col;
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return row;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return col;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	col = cellName.charAt(0)-'A';
    	row = Integer.parseInt(cellName.substring(1))-1;
    	
    	/*/charAt0 char for Col
    	 * use Substring 1 for string for Row
    	 * String row = parseInt
    	 * -1 -> index for row
    	 * char col -> charAt - A
    	 */
    }

}