import java.util.*;
import java.lang.*;

class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();//initial balance
		long M=sc.nextLong();//no. of operations
		while(M>0){
			long Type=sc.nextLong();
			long X=sc.nextLong();
			if(Type==1)
			{
				N=N+X;
				System.out.println(N);
			}
			else
			{
				if(Type==2 && X<N)
				{
					N=N-X;
					System.out.println(N);
				}
				else
				{
					System.out.println("Insufficent Funds");
				}
			}
			M--;
		}
	}
}

