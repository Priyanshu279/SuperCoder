import java.util.*;

class Main {
	public static int powerGame(int A,int B){
		int ans=1;
		for(int i=1;i<=B;i++){
			ans=ans*A;
		}
		if(ans >1000000000){
			return -1;
		}else{
			return ans;
		}
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int ans=powerGame(A,B);
		System.out.println(ans);
	}
}
