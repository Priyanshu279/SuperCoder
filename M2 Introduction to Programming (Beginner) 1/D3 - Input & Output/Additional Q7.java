import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
			Scanner sc=new Scanner(System.in);
			int oneBillPrice=sc.nextInt();
			int totalNoOfBills=sc.nextInt();
			int totalValueOfBills=oneBillPrice*totalNoOfBills;
			System.out.println(totalValueOfBills);
		}
	}