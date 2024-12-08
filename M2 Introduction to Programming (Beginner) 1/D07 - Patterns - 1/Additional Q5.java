import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int row=1;row<=N;row++){
			if(row==1||row==N){
				for(int i=1;i<=N;i++){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				for(int col=1;col<=N;col++){
				if(col==1||col==N){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			}
		}
	}