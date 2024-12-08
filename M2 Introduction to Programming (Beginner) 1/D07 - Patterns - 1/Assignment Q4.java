import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int row=1;row<=N;row++){
			for(int col=1;col<=row;col++){
				if(col%2==0){
					System.out.print(" ");
				}else{
					System.out.print(col);
				}
			}
			System.out.println();
		}
	}
}
