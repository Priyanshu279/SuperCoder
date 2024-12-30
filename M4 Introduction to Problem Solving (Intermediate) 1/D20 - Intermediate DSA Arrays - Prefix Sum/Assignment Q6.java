import java.util.*;

class Main {
	//Prefix Count
	public static int[] prefixCount(int arr[]){
		int pf[]=new int[arr.length];
		if(arr[0]%2==0){
			pf[0]=1;
		}else{
			pf[0]=0;
		}
	
		for(int i=1;i<arr.length;i++){
			pf[i]=pf[i-1];
			if(arr[i]%2==0){
				pf[i]++;
			}
		}
		return pf;
	}
	
	//Count Querry
	public static int[] countQuerry(int arr[],int Querry[][]){
		int count[]=new int[Querry.length];
		int pfCount[]=prefixCount(arr);
		
		for(int i=0;i<Querry.length;i++){
			int L=Querry[i][0];
			int R=Querry[i][1];
			if(L>0){
				int cnt=pfCount[R]-pfCount[L-1];
				count[i]=cnt;
			}else{
				count[i]=pfCount[R];
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int Q=sc.nextInt();
		
		int B[][] = new int[Q][2];
		for(int i=0;i<Q;i++){
			for(int j=0;j<2;j++){
				B[i][j]=sc.nextInt();
			}
		}
		int result[]=countQuerry(A,B);
		
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}