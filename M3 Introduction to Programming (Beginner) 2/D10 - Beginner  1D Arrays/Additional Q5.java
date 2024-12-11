import java.util.*;

class Main {
	public static int product(int A[]){
		int ans=1;
		for(int i=0;i<A.length;i++){
			ans=ans*A[i];
		}
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		int p=product(A);
		System.out.println(p);
		}
	}