import java.util.*;

class Main {
    public static int pickFromBothSides(int A[],int B){
        int n=A.length;
        int maxSum=Integer.MIN_VALUE;
        
        int pf[]=new int[n];
		pf[0]=A[0];
		for(int i=1;i<n;i++){
			pf[i]=pf[i-1]+A[i];
		}
        
        for(int i=0;i<B;i++){
            int leftSum=pf[i];
            int rightSum=pf[n-1]-pf[n-(B-i)];
            maxSum=Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
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
        
        int ans=pickFromBothSides(A,B);
        System.out.println(ans);
	}
}