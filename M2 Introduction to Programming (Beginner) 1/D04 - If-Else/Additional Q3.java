import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int sum=A+B+C;
		if(sum==180){
			System.out.println(1);
		}
		else{
			System.out.println(0);
		}
	}
}
