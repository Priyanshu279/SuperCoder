import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int add=num1+num2;
		int multiply=num1*num2;
		int sub=num1-num2;
		int div=num1/num2;
		System.out.print(add+" "+multiply+" "+sub+" "+div);
	}
}