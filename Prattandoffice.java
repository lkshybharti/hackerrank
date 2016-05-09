package hacker;

import java.util.Scanner;

public class Prattandoffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		//int t = sc.nextInt();
		
		String coolstring = sc.nextLine();
		
		char[] cstring =  coolstring.toCharArray();
		
		findcoolstring(cstring);
		
		

	}

	private static void findcoolstring(char[] cstring) {
		// TODO Auto-generated method stub
			int sum =0;
		for(int i=0; i<cstring.length;i++)
		{
			if(cstring[i]=='a')
			{
				sum=sum+1;
			}
			else if(cstring[i]=='b')
			{
				sum=sum+2;
			}
			else if(cstring[i]=='c')
			{
				sum=sum+3;
			}
			else if(cstring[i]=='d')
			{
				sum=sum+4;
			}
			else if(cstring[i]=='e')
			{
				sum=sum+5;
			}
			
			else
			{
				System.out.println("");
			}
		}
		
	}


}
