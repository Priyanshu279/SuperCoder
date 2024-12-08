import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int count=0;
		for(int i=1;i<=A;i++){
			if(A%i==0){
				count++;
			}
			if(count>2){
				break;
			}
		}
		if(count==2){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");	
		}
	}
}