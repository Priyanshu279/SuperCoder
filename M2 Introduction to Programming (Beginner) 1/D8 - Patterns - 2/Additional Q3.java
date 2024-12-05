import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=N-1;
		for(int row1=1;row1<=N;row1++){
			for(int str1=1;str1<=row1;str1++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row2=1;row2<N;row2++){
			for(int str2=1;str2<=M;str2++){
				System.out.print("*");
			}
			M--;
			System.out.println();
		}
	}
}