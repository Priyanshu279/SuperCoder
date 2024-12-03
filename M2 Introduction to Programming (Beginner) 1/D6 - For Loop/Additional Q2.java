import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
			int sum=0;
			int N=sc.nextInt();
			while(N>0){
				int d=N%10;
				sum=sum+d;
				N=N/10;
			}
			System.out.println(sum);
			}
		}
}