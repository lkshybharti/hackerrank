package hacker;
import java.util.*;
public class caeser_cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String ls =sc.nextLine();
		int n =Integer.parseInt(ls); 
		
		String inp =sc.nextLine();
		
		String lk =sc.nextLine();
		int k =Integer.parseInt(lk);
		if(inp.length() != n)
		{
			System.exit(0);
		}
		char[] str = inp.toCharArray(); 
		
		
		for(int i=0;i<str.length;i++)
		{
			int asc=(int)str[i];
			if((asc>=64 && asc<=91) || (asc>=96 && asc<=123) )
			{
				str[i]=(char)(asc+k);
			}
			
		}
		String cs = new String(str);
		System.out.println(cs);
	}

}
	