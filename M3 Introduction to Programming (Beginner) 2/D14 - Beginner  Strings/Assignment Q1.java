import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();//Consume the newline character after the integer input
		while(T>0){
			String S=sc.nextLine();
			int l=S.length();
			System.out.println(l);
			T--;
		}
	}
}