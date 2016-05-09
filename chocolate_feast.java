package implementaion;

import java.util.Scanner;

public class chocolate_feast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<=t;i++)
		{
		int money= sc.nextInt();
		int cost = sc.nextInt();
		int wrapper= sc.nextInt();
		
		
		chocolate( money, cost, wrapper);
		}
		
		sc.close();
	}

	private static void chocolate(int money, int cost, int wrapper) {
		// TODO Auto-generated method stub
		
		int toffee= money/cost;
		
		
		if(toffee>=wrapper)
		{
			int k= toffee;
			do{
				k=k-wrapper;
				toffee++;
				k++;
			}while(k>wrapper);
		}
		
		System.out.println(toffee);
		
	}

}
