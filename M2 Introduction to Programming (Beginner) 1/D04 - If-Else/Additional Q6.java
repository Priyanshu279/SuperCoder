import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int C=sc.nextInt();
		int S=sc.nextInt();
		if(S>C){
			System.out.println(1);
			System.out.println(S-C);
		}
		else{
			System.out.println(-1);
			System.out.println(C-S);
		}
	}
}