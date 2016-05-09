package hacker;

import java.util.Scanner;

public class plus_minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int l=sc.nextInt();
		int[] array = new int[l];
		
		double p=0;
		double n=0;
		double z=0;
		for(int i=0;i<=l-1;i++)
		{
			array[i]=sc.nextInt();
		}
		//System.out.println(array.length);
		
		for(int i=0;i<=l-1;i++)
		{
			if(array[i]>0)
			{
				p++;
			}
			else if(array[i]==0)
			{
				z++;
			}
			else if(array[i]<0)
			{
				n++;
			}
		}
		
		
		double pf = p/l;
		double zf = z/l;
		double nf = n/l;
		
		System.out.format("%f%n",pf);
		System.out.format("%f%n",nf);
		System.out.format("%f%n",zf);

	}

}
