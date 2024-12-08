import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int row=1;row<=N;row++){
			for(int zero1=1;zero1<=(N-row);zero1++){
				System.out.print(0);
			}
			for(int num1=row;num1<=((2*row)-1);num1++){
				System.out.print(num1);
			}
			for(int num2=((2*row)-2);num2>=row;num2--){
				System.out.print(num2);
			}
			for(int zero2=1;zero2<=(N-row);zero2++){
				System.out.print(0);
			}
			System.out.println();
		}
	}
}