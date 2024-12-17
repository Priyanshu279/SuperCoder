import java.util.*;

class Main {
	public static int countFactors(int A){
		int cnt=0;
		for(int i=1;i*i<=A;i++){
			// i & A/i both are your factors,if i is a factor
			if(A%i==0){
				if(i!=A/i){
					cnt=cnt+2;
				}
				else{//i==A/i (10==10)
					cnt=cnt+1;
				}
			}
		}
		return cnt;
	}
	
	public static int countPrimes(int n){
		int count=0;
		for(int i=2;i<=n;i++){
			int ans=countFactors(i);
			if(ans==2){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int ans=countPrimes(A);
		System.out.println(ans);
	}
}
