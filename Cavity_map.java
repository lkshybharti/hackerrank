package implementaion;

import java.util.Scanner;

public class Cavity_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int grid[][] = new int[n][n];
	        
	        for(int i=0; i < n; i++){
		        for(int j=0; j < n; j++){
		        	grid[i][j] = in.nextInt();
		        };
	        }
	        
	        
	        for(int i=1;i<n-1;i++)
	        {
	        	for(int j=1;j<n-1;j++)
	        	{
	        		int x= grid[i][j];
	        		if(x>grid[i][j+1] && x>grid[i][j-1] && x>grid[i+1][j] && x>grid[i-1][j])
	        		{
	        			grid[i][j]=0;
	        		}
	        	}
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=0;j<n;j++)
	        	{
	        		System.out.print(grid[i][j]);
	        	}
	        	System.out.println("");
	        }
	        
	        
	}

}
