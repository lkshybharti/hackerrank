package implementaion;

import java.util.Scanner;

public class grid_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int  n1 = sc.nextInt();
		int  n2 = sc.nextInt();
		int[][] matrix = new int[n1][n2];
		
		 for(int i=0;i<n1;i++){
	            String row = sc.nextLine();
	            for(int j=0;j<n2;j++){
	                matrix[i][j] = (int)(row.charAt(j) );
	            }

	        }
		
		int g1= sc.nextInt();
		int g2= sc.nextInt();
		int[][] grid = new int[g1][g2];
		
		 for(int i=0;i<g1;i++){
	            String row = sc.nextLine();
	            for(int j=0;j<g2;j++){
	                grid[i][j] = (int)(row.charAt(j) );
	            }

	        }
		
		
		 
		 
		 
		
		sc.close();

	}

}
