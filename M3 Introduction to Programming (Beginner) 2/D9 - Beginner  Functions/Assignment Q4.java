import java.util.*;

class Main {
	public static int chocolateBuy(int x,int y,int z){
		int c=x/y;
		int cnt=0;
		for(int i=1;i<=c;i++){
			if(i<=z){
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();//rs
		int B=sc.nextInt();//cost
		int C=sc.nextInt();//qty
		int totalChocolate=chocolateBuy(A,B,C);
		System.out.println(totalChocolate);
	}
}