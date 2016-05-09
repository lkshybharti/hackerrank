package string;

import java.util.Scanner;

public class funny_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		String S =sc.nextLine();
		String R ="";
		
		
		int l = S.length();
		
		for(int i=l-1;i>=0;i--)
		{
			R=R+S.charAt(i);
		}
		
		System.out.println(S);
		System.out.println(R);
		
		//int asc=(int)str[i]
		
		funny(S,R,l);
		
		//System.out.println(k);
		
	}
	
	private static void funny(String s, String r, int l) {
		
		
		boolean k=true;
		for(int j=0;j<l-1;j++)
		{
			int sk= ((int)s.charAt(j+1)) - ((int)s.charAt(j));
			Math.abs(sk);
			int rk= ((int)r.charAt(j+1)) - ((int)r.charAt(j));
			Math.abs(rk);
			
			System.out.println(sk+"----------"+rk);
			
			if(Math.abs(sk)!=Math.abs(rk))
			{
				k=false;
				break;
			}
		}
		
		if(k==true){
			System.out.println("funny");
		}
		else
		{
			System.out.println("not funny");
		}
		
		// TODO Auto-generated method stub
		
	}

		
	
}