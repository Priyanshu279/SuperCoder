import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int i=1;
		int pow=1;
		while(i<=B){
			pow=pow*A;//1,2..2//2,2..4//4,2..8
			i++;
		}
		System.out.println(pow);
	}
}