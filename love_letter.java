package string;

import java.util.Scanner;

public class love_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String string1 =sc.nextLine();
		
		char[] str= string1.toLowerCase().toCharArray();
		
		int l = str.length;
		//System.out.println(l/2);
		
		int sum = 0;
		
		
		if(l%2==0)
		{
			for(int i=0;i<l/2;i++)
			{
				if(str[i]<=str[l-i-1])
				{
					sum= sum+( ((int)str[l-i-1]) -((int)str[i]));
				}
				if(str[i]>=str[l-i-1])
				{
					sum= sum+(((int)str[i]) -((int)str[l-i-1]));
				}
			}
		}
		
		if(l%2==1)
		{
			for(int i=0;i<(l-1)/2;i++)
			{
				if(str[i]<=str[l-i-1])
				{
					sum= sum+( ((int)str[l-i-1]) -((int)str[i]));
				}
				if(str[i]>=str[l-i-1])
				{
					sum= sum+(((int)str[i]) -((int)str[l-i-1]));
				}
			}
		}
		
		System.out.println(sum);
		
		
	}
}
