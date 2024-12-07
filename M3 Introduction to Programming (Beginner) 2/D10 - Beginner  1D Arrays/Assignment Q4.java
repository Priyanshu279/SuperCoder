import java.util.*;

class Main {
	public static int[] otherArr(int arr[],int b){
		int n=arr.length;
		int outArr[]=new int[n];
		
		for(int i=0;i<n;i++){
			outArr[i]=arr[i]+b;
		}
		return outArr;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A[]=new int[]{1,2,3,2,1};
		int B=sc.nextInt();
		
		int result[]=otherArr(A,B);
		// System.out.print(arr);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}