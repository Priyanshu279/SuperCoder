import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int A=sc.nextInt();
            int sum=0;
            while(A>0){
                int d=A%10;
                sum=sum+d;
                A=A/10;
            }
            System.out.println(sum);
            T--;
        }
	}
}