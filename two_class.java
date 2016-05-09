package string;

import java.util.Scanner;

public class two_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String string1 =sc.nextLine();
		String string2 =sc.nextLine();
		
		char[] str1 = string1.toLowerCase().toCharArray();
		char[] str2 = string2.toLowerCase().toCharArray();
		
		
		int count = anagram(str1, str2);
		
		if(count == 1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
				
	}
	private static int anagram(char[] str1, char[] str2) {
		// TODO Auto-generated method stub
		
		
		int[] characters =  new int[256];
		
		int sum=0;
		
		for(int i=0;i<str1.length;i++)
		{
			characters[str1[i]]++;
		}
	 	
		for(int i=0;i<str2.length;i++)
		{
			if(characters[str2[i]] !=0)
			{
				sum=1;
			}
		}
		
		
		
		
		
		
		return sum;
	}
}
