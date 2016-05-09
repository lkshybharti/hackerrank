package string;

import java.util.ArrayList;
import java.util.Scanner;

public class gem_stone {
	
	public static void main(String[] args) {
		
		ArrayList<String> input_elements = new ArrayList<>();
		
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{		
			String elements = sc.nextLine();
			input_elements.add(elements);
		}
		
		int el = stone_elements(input_elements);
		
		System.out.println(el);
		sc.close();
		
	}
	
	static int stone_elements(ArrayList<String> elements)
	{
		char[] str = elements.get(0).toCharArray();

		int size = elements.size();
		
		
		int gem=0; 
		
		for(char c : str)
		{
			int count=0;
			for (int i=1; i<size ;i++)
			{
				String s = elements.get(i);
				
				if(s.indexOf(c) >= 0)
				{
					count++;	
				}
				
			}
			
			if(count == size)
			{
				gem++;
			}
		}
		
		
		return gem;
	}

}
