import java.util.*;

class Main {
	public static int countPrimes(int N){
		int countP=0;
		if(N<2){
			return 0;
		}else{
		for(int i=2;i<=N;i++){
			int cnt=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					cnt++;
				}
			}
			if(cnt==2){
				countP++;
			}
		}
		}
		
		return countP;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=countPrimes(n);
		System.out.println(cnt);
	}
}