import java.util.*;

class Main {
	public static int volumeOfSphere(int R){
		double volume=(4*Math.PI*R*R*R)/3;
		int ceil = (int) Math.ceil(volume);
		return ceil;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int volume=volumeOfSphere(A);
		System.out.println(volume);
	}
}