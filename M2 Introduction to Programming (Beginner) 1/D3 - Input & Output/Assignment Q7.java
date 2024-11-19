import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			int M=sc.nextInt();
			int preprationTime=N*2;
			int totalTime=preprationTime+M;
			System.out.println(totalTime);
		}
	}