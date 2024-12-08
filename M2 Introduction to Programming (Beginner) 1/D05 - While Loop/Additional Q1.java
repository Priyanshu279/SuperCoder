import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=A){
			if(i%2!=0){
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}