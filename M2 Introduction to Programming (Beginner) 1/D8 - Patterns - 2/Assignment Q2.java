import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int row=1;row<=N;row++){
			for(int str1=1;str1<=((N+1)-row);str1++){
				System.out.print("*");
			}
			for(int spc=1;spc<=((2*row)-2);spc++){
				System.out.print(" ");
			}
			for(int str2=1;str2<=((N+1)-row);str2++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}