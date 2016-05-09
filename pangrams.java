package string;

import java.util.Scanner;

public class pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String input_string =sc.nextLine();
		
		System.out.println(input_string);
		int d= pangram(input_string.toLowerCase());
		
		if(d==-1)
		{
			System.out.println("Not a pangram");
		}
		
		else {
			System.out.println("A pangram");
		}
		
		sc.close();

	}
	
	public static int pangram (String input_string)
	{
		if(input_string.length()<26)
		{
			return -1;
		}
		
		for(char ch ='a';ch <='z'; ch++)
		{
			if(input_string.indexOf(ch)< 0)
			{
				return -1;
			}
		}
		
		
		return 1;
	}

}
