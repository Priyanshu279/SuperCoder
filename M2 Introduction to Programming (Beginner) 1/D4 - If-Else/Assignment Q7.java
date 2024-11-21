import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		if(A==B && B==C){
			System.out.println("Equilateral Triangle");
		}
		else if(A == B || B == C || A == C){
			System.out.println("Isosceles Triangle");
		}
		else{
			System.out.println("Scalene Triangle");
		}
	}
}