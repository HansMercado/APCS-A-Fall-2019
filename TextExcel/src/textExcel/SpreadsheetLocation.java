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
    	row = Integer.parseInt(cellName.substring(1))-1;
    	//deal with capitals.
    	if (cellName.charAt(0)>90) {
    		col = cellName.charAt(0) - 'A' -32;
    	} else col = cellName.charAt(0)-'A';
    	
    	/*/charAt0 char for Col
    	 * use Substring 1 for string for Row
    	 * String row = parseInt
    	 * -1 -> index for row
    	 * char col -> charAt - A
    	 */
    }

}
