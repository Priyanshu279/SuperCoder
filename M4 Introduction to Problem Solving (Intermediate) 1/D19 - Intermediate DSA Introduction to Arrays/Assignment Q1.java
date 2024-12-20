import java.util.*;

class Main {
	public static int count(int A[]){
		int N=A.length;
		int max=A[0];
		
		for(int i=0;i<N;i++){
			if(A[i]>max){
				max=A[i];
			}
		}
		
		int c=0;
		for(int i=0;i<N;i++){
			if(A[i]==max){
				c++;
			}
		}
		return N-c;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int ans=count(A);
		System.out.println(ans);
	}
}