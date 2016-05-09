package sorting;

import java.util.*;

public class insertionsort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int ini =0;
		int[] list = new int[n];
		
		for(int i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
		}
		
		int k = list[n-1]; 
		for(int j=n-2;j>-1;j--)
		{
			if(k<list[j])
			{
				list[j+1] =list[j];
				
				printArray(list);
			}
			else if (list[j] < k)
			{
                list[j+1] = k;
                printArray(list);
                ini =1;
                break;
			}
		}
		if(ini==0)
		{
			list[0]=k;
		}
		printArray(list);
		
	}

	private static void printArray(int[] list) {
		// TODO Auto-generated method stub
		for(int n: list){
	        System.out.print(n+" ");
	     }
	       System.out.println("");
	}

}
