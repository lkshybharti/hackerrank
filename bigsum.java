package hacker;

import java.util.Scanner;

public class bigsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t;
		long sum=0;
		t=sc.nextInt();
		int[] arr= new int [t];

		for(int i=0;i<t;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);

		
		
		
	}

}
