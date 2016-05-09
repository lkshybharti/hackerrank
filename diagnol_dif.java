package hacker;

import java.util.Scanner;

public class diagnol_dif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		int n=in.nextInt();
		int sum1=0;
		int sum2=0;
		int k=n;
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sum1=sum1+arr[i][j];
				}
			}
		}
		
		System.out.println(sum1);
		
		for(int i=0;i<n;i++)
		{
			sum2=sum2+arr[i][--k];
		
		}
		
		System.out.println(sum2);
		
		System.out.println((sum1-sum2));
	}

}
