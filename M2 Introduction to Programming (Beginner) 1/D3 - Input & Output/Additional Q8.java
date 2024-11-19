import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
			Scanner sc=new Scanner(System.in);
			float totalBillAmount=sc.nextFloat();
			float amountOfSingleBill=sc.nextFloat();
			int noOfBill=(int)(totalBillAmount/amountOfSingleBill);
			System.out.println(noOfBill);
		}
	}