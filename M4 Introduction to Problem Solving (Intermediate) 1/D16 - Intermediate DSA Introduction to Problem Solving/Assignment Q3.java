import java.util.*;

class Main {
	public static int squareRoot(int A){
		int i=1;
		int ans=1;
		while((long)i*i<=A){
			ans=i;
			i++;
		}
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int ans=squareRoot(A);
		
		if(ans%2==0){
			System.out.println(ans);
		}else{
			System.out.println(-1);
		}
		
	}
}