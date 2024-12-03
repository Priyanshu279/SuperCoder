import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		if(N==1||N==0){
			System.out.println(N);
		}
		else{
			for(int j=2;j<=N;j++)
			{
				int counter=0;
				for(int i=1;i<=j;i++){
					if(j%i==0){
						counter++;
					}
				}
				if(counter==2){
				System.out.println(j);
				}
			}
		}
	}
}