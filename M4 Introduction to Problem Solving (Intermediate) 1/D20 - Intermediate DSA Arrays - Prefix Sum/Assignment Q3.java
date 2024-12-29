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
	
	//Brute force
	public static int[] sumQuerry(int arr[],int querry[][]){
		int qlen=querry.length;
		int ans[]=new int[qlen];
		for(int i=0;i<querry.length;i++){
			int L=querry[i][0];
			int R=querry[i][1];
			int sum=0;
			for(int j=L;j<=R;j++){
				sum=sum+arr[j];
			}
			ans[i]=sum;
		}
		return ans;
	}
	
	//Optimal 
	public static int[] sumQuerryOptimal(int arr[],int querry[][]){
		int qlen=querry.length;
		int ans[]=new int[qlen];
		int pf[]=prefixSum(arr);
		
		for(int i=0;i<querry.length;i++){
			int L=querry[i][0];
			int R=querry[i][1];
			int sum=0;
			if(L>0){
				sum=pf[R]-pf[L-1];
				ans[i]=sum;
			}else{
				ans[i]=pf[R];
			}
		}
		return ans;
	}
	
	public static void main(String args[]){
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int M=sc.nextInt();
		
		int B[][] = new int[M][2];
		for(int i=0;i<M;i++){
			for(int j=0;j<2;j++){
				B[i][j]=sc.nextInt();
			}
		}
		int result[]=sumQuerryOptimal(A,B);
		
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}