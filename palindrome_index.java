package string;

import java.util.Scanner;

public class palindrome_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String string1 =sc.nextLine();
		
		int l = string1.length();
		
		
		String str= string1.toLowerCase();
		
		int x=0;
		palindrome(str,l,x);
		
		

	}
	
	static void palindrome(String str, int l,int x)
	{
		
		if(l%2==0)
		{
			for(int i=0;i<=l/2;i++)
			{
				
			}
		}
		
		
	}

}
