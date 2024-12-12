import java.util.*;

class Main {
	public static int diagonalSum(ArrayList<ArrayList<Integer>> A){
		int N=A.size();
		int sum=0;
		for(int i=0;i<N;i++){
			sum=sum+A.get(i).get(i);
		}
		return sum;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		int n=sc.nextInt();
		
		for(int row=0;row<n;row++){
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int col=0;col<n;col++){
				l.add(sc.nextInt());
			}
			A.add(l);
		}
		
		int result = diagonalSum(A);
		System.out.println(result);
	}
}