package string;

import java.util.Scanner;

public class alternating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
				
		String input_string =sc.nextLine();
		//System.out.println(input_string);
	
		
		alternate(input_string,input_string.length());

//		System.out.println(count);
		
		sc.close();
	}

	private static void alternate(String input_string, int len) {
		
		char[] characters = input_string.toCharArray();
		 
		char a='A';
		char b='B';
		int del=0;
		
		for(int j=0;j<len-1;j++)
		{
				if(characters[j]== a || characters[j]==b)
				{
					if(characters[j] == characters[j+1])
					{
						del++;
					}
				}
				else {
					System.out.println("Wrong INPUT");
					del=0;
					break;
					
				}
								
		}
		
		
		System.out.println(del);
		
		
		
	}

}
