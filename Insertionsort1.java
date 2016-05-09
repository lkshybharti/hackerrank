package sorting;

import java.util.Scanner;

public class Insertionsort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	       insertionSortPart2(ar,s);    
	                    
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
	    		
	    		
	    		printArray(ar);
	    		
	    	}
	    	
	    
	    System.out.println("shifts = "+z);
	    
	    }
		private static void printArray(int[] ar) {
	      for(int n:ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
		
	

}
