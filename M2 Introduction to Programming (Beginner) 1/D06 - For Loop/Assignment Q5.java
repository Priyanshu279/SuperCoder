import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(;T>0;T--){
			int N=sc.nextInt();
			int count=0;
			for(;N>0;N=N/10){
				count++;
			}
			if(count==0){
				System.out.println(1);
			}
			else{
				System.out.println(count);
			}
		}
	}
}