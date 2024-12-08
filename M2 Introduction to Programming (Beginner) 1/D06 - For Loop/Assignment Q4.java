import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(;T>0;T--){
			int sum=0;
			int N=sc.nextInt();
			for(int j=1;j<N;j++){
				if(N%j==0){
					sum=sum+j;
				}
			}
			if(sum==N){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}