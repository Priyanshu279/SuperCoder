import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		int max=0;
		int N=0;
		
		if(A>=B){
			N=A;
		}else{
			N=B;
		}
		
		for(int i=1;i<=N;i++){
			if(A%i==0 && B%i==0){
				if(i>max){
					max=i;
				}
			}
		}
		System.out.println(max);
	}
}