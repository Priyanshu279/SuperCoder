import java.util.*;

class Main {
	public static int noOfGlass(int A,int B){
		int res=0;
		res=((A*3)+(B))/2;
		return res;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int glass=noOfGlass(A,B);
		System.out.println(glass);
	}
}
