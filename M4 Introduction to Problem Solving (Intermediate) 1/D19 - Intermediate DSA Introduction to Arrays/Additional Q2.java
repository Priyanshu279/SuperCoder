import java.util.*;

class Main {
	public static int occurancesOfBInA(int A[],int B){
		int cnt=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==B){
				cnt++;
			}
		}
		return cnt;
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
		
		int result = occurancesOfBInA(A,B);
		System.out.println(result);
	}
}