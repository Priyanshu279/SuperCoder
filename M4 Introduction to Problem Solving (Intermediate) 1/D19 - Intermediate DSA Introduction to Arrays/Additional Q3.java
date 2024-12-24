import java.util.*;

class Main {
	public static int secondLargest(int A[]){
		if(A.length<2){
			return -1;
		}
		int max1=-1;
		int max2=-1;
		
		for(int i=0;i<A.length;i++){
			if(A[i]>max1){
				max2=max1;
				max1=A[i];
			}else if(A[i]>max2 && max1<=A[i]){
				max2=A[i];
			}
		}
		return max2;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int result = secondLargest(A);
		System.out.println(result);
	}
}