import java.util.*;

class Main {
	public static int perfectSquare(int A){
		 for (int i = 1; i <=A; i++){
            if (i == A / i) {
                return 1;
            }
        }
        return 0;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println(perfectSquare(A));
	}
}
