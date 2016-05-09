package hacker;

import java.util.Scanner;

public class library_fine {
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);

		int [] exp_return = new int[3];
		int [] act_return = new int[3];

		System.out.println("enter the returned date :");
		String returndate=sc.nextLine();
		System.out.println("enter the DueDate date :");
		String duedate =sc.nextLine();
		
		String[] dd = duedate.split(" "); 		
		
		exp_return[0] = Integer.parseInt(dd[0]);
		exp_return[1] = Integer.parseInt(dd[1]);
		exp_return[2] = Integer.parseInt(dd[2]);
			
		String[] rd = returndate.split(" "); 
		
		act_return[0] = Integer.parseInt(rd[0]);
		act_return[1] = Integer.parseInt(rd[1]);
		act_return[2] = Integer.parseInt(rd[2]);
		

		if(1>act_return[0] || act_return[0]>30 || 1>=exp_return[0] || exp_return[0]>31 || 1>act_return[2] || act_return[2]>3000 || 1>exp_return[2] || exp_return[2]>3000 || 1>act_return[1] || act_return[1]>=12 || 1>=exp_return[1] || exp_return[1]>12)
		{
			System.out.println(" Wrong Date Entry");
			System.exit(0);
		}
		
		int days_fine;
		
		if((exp_return[2] <= act_return[2]) && (exp_return[1]>=act_return[1]) && (exp_return[0]>=act_return[0]))
		{
			System.out.println("no fine");
		}
		
		if((exp_return[2] <= act_return[2]) && (exp_return[1]==act_return[1]) && (exp_return[0]<act_return[0]))
		{
			days_fine=(act_return[0]-exp_return[0])*15;
					
			System.out.println("Your Fine is :"+days_fine+"Hackos");
		}
		
		if((exp_return[2] <= act_return[2]) && (exp_return[1]<act_return[1]))
		{
			days_fine=(act_return[1]-exp_return[1])*500;
					
			System.out.println("Your Fine is :"+days_fine+"Hackos");
		}
		if((exp_return[2] > act_return[2]))
		{
			System.out.println("Your Fine is :1000 Hackos");
		}

		
	}

}
