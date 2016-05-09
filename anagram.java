package string;

import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String string1 =sc.nextLine();
		String string2 =sc.nextLine();
		 boolean s=true;
		char[] str1 = string1.toLowerCase().toCharArray();
		char[] str2 = string2.toLowerCase().toCharArray();
		
		int[] allchars=new int[256];
		
		for(int i=0;i<str1.length;i++)
		{
			allchars[str1[i]]++;
		}
		for(int i=0;i<str2.length;i++)
		{
			allchars[str2[i]]--;
		}
		
		for(int j=0;j<allchars.length;j++)
		{
			if(allchars[j]==0)
			{
				s=true;
			}
			else {
				s=false;
			}
			
		}
		
		System.out.println(s);
	}

}
