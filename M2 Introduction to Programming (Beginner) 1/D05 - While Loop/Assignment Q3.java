import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=N){
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
}