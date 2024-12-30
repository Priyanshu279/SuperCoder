import java.util.*;

class Main {
	//Prefix sum
	public static int[] prefixSum(int arr[]){
		int n=arr.length;
		int pf[]=new int[n];
		pf[0]=arr[0];
		for(int i=1;i<n;i++){
			pf[i]=pf[i-1]+arr[i];
		}
		return pf;
	}
	
	public static int equilibriumIndex(int A[]){
		int pf[]=prefixSum(A);
		int n=A.length;
	 
		if(pf[n-1]-A[0]==0){
			return 0;
		}
		
		for(int i=1;i<n;i++){
			int leftSum=pf[i-1];
			int rightSum=pf[n-1]-pf[i];
			
			if(leftSum==rightSum){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int count=equilibriumIndex(A);
		System.out.println(count);
	}
}