import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			float avg=(float)(a+b+c+d+e)/5;
			System.out.print(String.format("%.2f", avg));
		}
	}