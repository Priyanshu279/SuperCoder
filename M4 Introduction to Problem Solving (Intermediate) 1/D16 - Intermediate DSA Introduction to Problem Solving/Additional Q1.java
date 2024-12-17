import java.util.*;

class Main {
	public static int perfectNumber(int A){
		int sum=0;
		for(int i=1;i<A;i++){
			if(A%i==0){
				sum=sum+i;
			}
		}
		if(sum==A){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int ans=perfectNumber(A);
		System.out.println(ans);
	}
}
