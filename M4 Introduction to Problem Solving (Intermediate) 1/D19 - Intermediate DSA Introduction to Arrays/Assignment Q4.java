import java.util.*;

class Main {
	public static void reverse(int A[]){
		int i=0;
		int j=A.length-1;
		while(i<j){
			int temp=A[i];
			A[i]=A[j];
			A[j]=temp;
			i++;
			j--;
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
		
		reverse(A);
		
		for(int i=0;i<N;i++){
			System.out.print(A[i]+" ");
		}
	}
}