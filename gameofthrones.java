package string;

import java.util.Scanner;

public class gameofthrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String string1 =sc.nextLine();
		
		boolean s=true;
		
		char[] str1 = string1.toLowerCase().toCharArray();
		
		int[] list = new int[256]; 
		
		for(int i=0;i<str1.length;i++)
		{
			 list[str1[i]]++;
		}
		
		int odd=0, even=0;
		
		for(int j=0;j<list.length;j++)
		{
			if(list[j]%2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		if(odd<=1)
		{
			s=true;
		}
		else
		{
			s=false;
		}
		
		System.out.println(s);

	}

}
