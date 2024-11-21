import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		if(A==1){
			System.out.println("January");
		}
		else if(A==2){
			System.out.println("February");
		}
		else if(A==3){
			System.out.println("March");
		}
		else if(A==4){
			System.out.println("April");
		}
		else if(A==5){
			System.out.println("May");
		}
		else if(A==6){
			System.out.println("June");
		}
		else if(A==7){
			System.out.println("July");
		}
		else if(A==8){
			System.out.println("August");
		}
		else if(A==9){
			System.out.println("September");
		}
		else if(A==10){
			System.out.println("October");
		}
		else if(A==11){
			System.out.println("November");
		}
		else if(A==12){
			System.out.println("December");
		}
		else{
			System.out.println("Invalid month number");	
		}
	}
}