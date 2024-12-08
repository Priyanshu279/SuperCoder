import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int row=1;row<=N;row++){
			for(int spc=1;spc<=(row-1);spc++){
				System.out.print(" ");
			}
			for(int str=1;str<=N+1-row;str++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}