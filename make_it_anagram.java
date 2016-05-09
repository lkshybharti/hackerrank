package string;

import java.util.Arrays;
import java.util.Scanner;

public class make_it_anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String string1 =sc.nextLine();
		String string2 =sc.nextLine();
		
		char[] str1 = string1.toLowerCase().toCharArray();
		char[] str2 = string2.toLowerCase().toCharArray();
		
		int count = anagram(str1, str2);
		
		if(count == 0)
		{
			System.out.println("0");
		}
		else if(count!=0)
		{
			System.out.println(count);
		}
		
	}

	private static int anagram(char[] str1, char[] str2) {
		// TODO Auto-generated method stub
		
		int s1= str1.length;
		int s2= str2.length;
		
		if(s1!=s2)
		{
			return 0;
		}
				
//		Arrays.sort(str1);
//		Arrays.sort(str2);
		
		
		int[] characters =  new int[256];
		
		
		
		for(int i=0;i<str1.length;i++)
		{
			characters[str1[i]]++;
		}
	 	
		for(int i=0;i<str2.length;i++)
		{
			characters[str2[i]]--;
		}
		
		
		int sum=0;
		
		for(int j=0;j<characters.length;j++)
		{
			if(characters[j]<0)
			{
				sum=sum-characters[j];
			}
			if(characters[j]>0)
			{
				sum=sum+characters[j];
			}
			
		}
		

				
		return sum;
	}
	
	

}
