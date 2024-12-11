import java.util.*;

class Main {
	public static void removeX(int A[],int X){
		for(int i=0;i<A.length;i++){
			if(i!=X-1){
				System.out.print(A[i]+" ");	
			}
		}
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		int X=sc.nextInt();
		removeX(A,X);
		}
	}