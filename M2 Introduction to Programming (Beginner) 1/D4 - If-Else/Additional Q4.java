import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();//100 cuurent balance
		int C=sc.nextInt();//choice
		int X=sc.nextInt();//add/sub X from N
		int finalAmount=0;
		
		if(C==2 && X>N){
			System.out.println("Insufficient Funds");
		}
		else if(C==1){
			finalAmount=N+X;
			System.out.println(finalAmount);//print final amount left in the bank
		}
		else if(C==2){
			finalAmount=N-X;
			System.out.println(finalAmount);//print final amount left in the bank
		}
		else{
			System.out.println("Invalid Operation Performed");
		}
		 
		}
	}