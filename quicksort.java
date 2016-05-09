package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt(); 
        }
        partition(ar);
    }    
	
	 private static void partition(int[] ar) {
		// TODO Auto-generated method stub
		 int k = ar[0];
		 int[] copy = new int[ar.length];
		 
		 copy = Arrays.copyOf(ar, ar.length);
		 int c=0;
		 
		 for(int i=1;i<ar.length;i++)
		 {
			 if(copy[i]<=k)
			 {
				 ar[c]=copy[i];
				 c++;
			 }
		 }
		 ar[c]=k;
		 c++;
		 for(int i=0; i<ar.length;i++)
		 {
			 if(copy[i]>k)
			 {
				 ar[c]=copy[i];
				 c++;
			 }
		 }

		 
		 printArray(ar);
		 

		
	}

	static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
	 

}
