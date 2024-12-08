import java.util.*;

class Main {
	public static int mangoShakes(int x,int y){
		int glass = ((3*x)+(y))/2;
		return glass;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();//mangoes
		int B=sc.nextInt();//slices
		int totalGlass=mangoShakes(A,B);
		System.out.println(totalGlass);
	}
}