import java.util.*;

class Main {
	public static int sumOfEven(int A[],int l,int r){
		int sum=0;
		for(int i=l;i<=r;i++){
			if(i%2==0){
				sum=sum+A[i];
			}
		}
		return sum;
	}
	
	public static int sumOfOdd(int A[],int l,int r){
		int sum=0;
		for(int i=l;i<=r;i++){
			if(i%2!=0){
				sum=sum+A[i];
			}
		}
		return sum;
	}
	
	public static int countSpecialIndex(int A[]){
		int N=A.length;
		int count=0;
		
		for(int i=0;i<N;i++){
			int Se=sumOfEven(A,0,i-1)+sumOfOdd(A,i+1,N-1);
			int So=sumOfOdd(A,0,i-1)+sumOfEven(A,i+1,N-1);
			
			if(Se==So){
				count++;
			}
		}	
		return count;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		
		int ans=countSpecialIndex(A);
		System.out.println(ans);
	}
}