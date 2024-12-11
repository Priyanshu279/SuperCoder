import java.util.*;

class Main {
	public static int absoluteDiff(int A[]){
		int cntEven=0;
		int cntOdd=0;
		int abs=0;
		for(int i=0;i<A.length;i++){
			if(A[i]%2==0){
				cntEven++;
			}else{
				cntOdd++;
			}
		}
		abs=Math.abs(cntEven-cntOdd);
		return abs;
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
		int result=absoluteDiff(A);
		System.out.println(result);
		T--;
		}
	}
}