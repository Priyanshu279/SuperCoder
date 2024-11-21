import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(A<B){
			System.out.println(A+" is minimum");
		}
		else if(B<A){
			System.out.println(B+" is minimum");
		}
		else{
			System.out.println("Both are equal");
		}
	}
}