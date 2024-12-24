import java.util.*;

class Main {
	public static int minimumTime(int A[]){
		int sec=0;
		int max=A[0];
		for(int i=0;i<A.length;i++){
			if(A[i]>max){
				max=A[i];
			}
		}
		
		for(int i=0;i<A.length;i++){
			int s=max-A[i];
			sec=sec+s;
		}
		return sec;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int result = minimumTime(A);
		System.out.print(result);
	}
}