package hacker;

import java.util.Scanner;

public class staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		int l=sc.nextInt();
		
		for(int i=0;i<l;i++)
		{
			for(int k=l-1;k>i;k--)
			{
				System.out.printf(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.printf("#");
			}
			System.out.println();
		}

	}

}
