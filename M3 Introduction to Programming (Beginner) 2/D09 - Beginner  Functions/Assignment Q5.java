import java.util.*;

class Main {
	public static double areaOfCircle(int r){
		double area = Math.PI*r*r;
		double round = Math.round(area*100.0)/100.0;
		return round;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		double area=areaOfCircle(A);
		System.out.println(area);
	}
}