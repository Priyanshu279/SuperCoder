import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if(A<=B && A<=C){
			System.out.println(A+" is minimum");
		}
		else if (B<=C){
			System.out.println(B+" is minimum");
		}else{
			System.out.println(C+" is minimum");
		}
	}
}
