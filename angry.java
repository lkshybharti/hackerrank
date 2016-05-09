package implementaion;

import java.util.*;

public class angry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		int test=sc.nextInt();
		
		for(int q=0;q<=test;q++)
		{
			int n =sc.nextInt();
			int k =sc.nextInt();
			
			int[] attendance = new int[n];
			
			
			for(int i=0;i<n;i++)
			{
				attendance[i]= sc.nextInt();
			}
			
			int t=0;
			
			for(int i=0;i<n;i++)
			{
				if(attendance[i]>=0)
				{
					t++;
				}
			}
			
			if(t>=k)
			{
				System.out.println("NO");
			}
			else
			{	
				System.out.println("YES");		
			}
			
		}
		
		
//		int n =sc.nextInt();
//		int k =sc.nextInt();
//		
//		int[] attendance = new int[n];
//		
//		
//		for(int i=0;i<n;i++)
//		{
//			attendance[i]= sc.nextInt();
//		}
//		
//		int t =0;
//		
//		for(int i=0;i<n;i++)
//		{
//			if(attendance[i]>0)
//			{
//				t++;
//			}
//		}
//		
//		if(t>=k)
//		{
//			System.out.println("NO");
//		}
//		else
//		{	
//			System.out.println("YES");		
//		}
//		
		
		sc.close();

	}

}
