import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int temp=A;
		int ans=0;
		
		if(temp<0){
			temp=temp*(-1);
		}
		for(;temp>0;temp=temp/10){
			int d=temp%10;
			ans=ans*10+d;
		}
		if(A<0){
			ans = ans*(-1);
		}
		else{
			ans=ans;
		}
		
		if(ans==A){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}