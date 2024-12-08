import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=1;
		while(i<=N){
			if(i%4==0){
				System.out.print(i+" ");
			}
			i++;
		}
	}
}