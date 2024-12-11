import java.util.*;

class Main {
	public static void printEvenOdd(int A[]){
		
		for(int i=0;i<A.length;i++){
			if(A[i]%2!=0){
				System.out.print(A[i]+" ");	
			}
		}
		System.out.println();
		for(int i=0;i<A.length;i++){
			if(A[i]%2==0){
				System.out.print(A[i]+" ");	
			}
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		printEvenOdd(A);
		T--;
		}
	}
}