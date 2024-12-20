import java.util.*;

class Main {
	public static void reverseInRange(int A[],int B,int C){
		while(B<C){
			int temp=A[B];
			A[B]=A[C];
			A[C]=temp;
			B++;
			C--;
		}
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		reverseInRange(A,B,C);
		
		for(int i=0;i<N;i++){
			System.out.print(A[i]+" ");
		}
	}
}