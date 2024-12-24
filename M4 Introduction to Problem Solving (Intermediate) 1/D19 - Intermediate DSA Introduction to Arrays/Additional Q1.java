import java.util.*;

class Main {
	public static int maxMinSum(int A[]){
		int sum=0;
		int max=A[0];
		int min=A[0];
		for(int i=0;i<A.length;i++){
			if(A[i]>max){
				max=A[i];
			}else if(A[i]<min){
				min=A[i];
			}
		}
		sum=max+min;
		return sum;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		int result = maxMinSum(A);
		System.out.println(result);
	}
}