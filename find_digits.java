package implementaion;

import java.util.Scanner;

public class find_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
	
		
		int i=0;
		
		while(input!=0)
		{
			int k = input%10;
			if((k!=0) && (input%k==0))
			{
				i++;
			}
			
			input = input/10;
			
		}
		System.out.println(i);
	}

}
