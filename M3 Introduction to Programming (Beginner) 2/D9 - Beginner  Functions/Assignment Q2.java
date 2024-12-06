import java.util.*;

class Main {
	public static int sumOfEvens(int X){
		int sum=0;
		for(int i=1;i<=X;i++){
			if(i%2==0){
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int sum=sumOfEvens(A);
		System.out.println(sum);
	}
}