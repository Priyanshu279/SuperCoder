import java.util.*;

class Main {
	public static int getBinary(int A){
		int b=0;
		int d=1;
		while(A>0){
			int r=A%2;
			b=b+r*d;
			A=A/2;
			d=d*10;
		}
		return b;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int binary = getBinary(A);
		System.out.println(binary);
	}
}