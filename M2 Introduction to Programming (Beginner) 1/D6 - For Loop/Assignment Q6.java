import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int temp=N;
		int ans=0;
		if(temp<0){
			temp=temp*(-1);
		}
		for(;temp>0;temp=temp/10){
			int d=temp%10;
			ans=ans*10+d;
		}
		if(N<0){
			System.out.println(ans*(-1));
		}
		else{
			System.out.println(ans);
		}
		
	}
}