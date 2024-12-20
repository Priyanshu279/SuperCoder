import java.util.*;

class Main {
	public static void reverse(int A[],int B,int C){
		int i=B;
		int j=C;
		while(i<j){
			int temp=A[i];
			A[i]=A[j];
			A[j]=temp;
			i++;
			j--;
		}
	}
	
	public static void rotate(int A[],int B){
		int N=A.length;
		if(B>N){
			B=B%N;
		}
		reverse(A,0,N-1);
		reverse(A,0,B-1);
		reverse(A,B,N-1);
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
		
		rotate(A,B);
		
		for(int i=0;i<N;i++){
			System.out.print(A[i]+" ");
		}
	}
}