public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * 
   * @param passedValue is the value we are looking for in the array
   * @return the total amount of times passedValue is found in the array
   */
  public int getCount(int passedValue)
  {
	  int count = 0;
	  for(int row = 0; row < matrix.length; row++)
	  {
		  for(int column = 0; column < matrix[0].length; column++)
		  {
			  if(matrix[row][column] == passedValue)
			  {
				  count++;
			  }
		  }
	  }
	  return count;
  }
  /**
   * 
   * @return largest number found in the given matrix
   */
  public int getLargest()
  {
	  int largestNumber = 0;
	  for(int row = 0; row < matrix.length; row++)
	  {
		  for(int column = 0; column < matrix[0].length; column++)
		  {
			  if(matrix[row][column] >= largestNumber)
			  {
				  largestNumber = matrix[row][column];
			  }
		  }
	  }
	  return largestNumber;
  }
  
  /**
   * 
   * @param colIndex is the index of the column we are going to look in
   * @return the total value of all integers in a specified column 
   */
  public int getColTotal(int colIndex)
  {
	  int columnTotal = 0;
	  for(int row = 0; row < matrix.length; row++)
	  {
		  columnTotal += matrix[row][colIndex];
	  }
	  return columnTotal;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
}