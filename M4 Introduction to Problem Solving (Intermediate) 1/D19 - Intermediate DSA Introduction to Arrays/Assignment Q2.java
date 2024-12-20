import java.util.*;

class Main {
	public static int goodPair(int A[],int B){
		int N=A.length;
		for(int i=0;i<N-1;i++){
			for(int j=i+1;j<N;j++){
				if(A[i]+A[j]==B){
					return 1;
				}
			}
		}
		return 0;
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
		
		int ans=goodPair(A,B);
		System.out.println(ans);
	}
}