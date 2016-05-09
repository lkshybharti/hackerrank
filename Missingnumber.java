package implementaion;

import java.util.Scanner;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int n =sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		
		insertionSortPart2(array,n);
		
	

	}
	
	
	private static void insertionSortPart2(int[] ar, int s) {
		
    	// TODO Auto-generated method stub
    	int z=0;
    	for(int i=1;i<s;i++){
    		
    		int key = ar[i];
    		
    		
    		
    		for (int j=i-1;j>=0;j--)
    		{
    			if(ar[j]>key)
    			{
    				ar[j+1]=ar[j];
    				ar[j]=key;
    				z++;
    			}
    			else if(key<=ar[j])
    			{
    				ar[j+1]=key;
    			}    			
    		}
    		
    	}
    	
    	find(ar);
	}

	private static void find(int[] array) {
		// TODO Auto-generated method stub
		int i=array[0];
		int k=0;
		
		while(i!=array[array.length-1])
		{
			
		}
		
	}

}
