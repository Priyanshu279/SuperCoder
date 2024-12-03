import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=1;i<=N;i++){
			int sum=0;
			int r;
			int j;
			j=i;
			
			while(j>0){
				r=j%10;
				sum = sum+(r*r*r);
				j=j/10;
			}
			
			if(sum==i){
				System.out.println(i);
			}
		}
	}
}