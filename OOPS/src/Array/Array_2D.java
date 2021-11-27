package Array;

public class Array_2D 
{
	  public static void main(String[] args)
	    {
	  
	        int[][] arr = { { 17, 75 }, { 378, 754 } };
	  
	        for (int i = 0; i < 2; i++)
	        {
	            for (int j = 0; j < 2; j++)
	            {
	            	System.out.println("arr[" + i + "][" + j + "] = "+ arr[i][j]);
	            }
	        }
	        System.out.println(arr[0][1]);
	    }
}
