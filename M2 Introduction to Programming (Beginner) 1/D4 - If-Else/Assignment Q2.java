import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		if(A>0){
			System.out.println("1");
		}
		else if(A<0){
			System.out.println("-1");
		}
		else{
			System.out.println("0");
		}
	}
}