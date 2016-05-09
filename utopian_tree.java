package implementaion;

import java.util.Scanner;

public class utopian_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
//		int test=sc.nextInt();
//		for(int k=0;k<test;k++)
//		{
		
		int cycle=sc.nextInt();
		
		int height=1;
		
		int h = utopiantree(cycle,height);

		System.out.println(h);
//		}
	}

	private static int utopiantree(int cycle, int height){
		// TODO Auto-generated method stub
		
		
			for(int i=cycle;i>1;i--)
			{
				if(i%2==1)
				{
					height= height+1;
				}
				else
				{
					height=height*2;
				}
			}
			
		
				
	 return height;
	}

}
