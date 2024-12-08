import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int E=sc.nextInt();
		double avg=(double)(A+B+C+D+E)/500;
		double rawPercentage = avg*100;
		int percentage=(int)rawPercentage;
		
		System.out.println(percentage);
		
		if(percentage>=90){
			System.out.println("Grade A");
		}
		else if(percentage>=80){
			System.out.println("Grade B");
		}
		else if(percentage>=70){
			System.out.println("Grade C");
		}
		else if(percentage>=60){
			System.out.println("Grade D");
		}
		else if(percentage>=40){
			System.out.println("Grade E");
		}else{
			System.out.println("Grade F");
		}
	}
}