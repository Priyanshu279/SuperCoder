import java.util.*;

class Main {
	public static ArrayList<Integer> cubeOfArray(ArrayList<Integer> A){
		ArrayList<Integer> B=new ArrayList<Integer>();
		int size=A.size();
		for(int i=0;i<size;i++){
			B.add(A.get(i)*A.get(i)*A.get(i));
		}
		return B;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
			int val=sc.nextInt();
			A.add(val);
		}
	
		ArrayList<Integer> B=cubeOfArray(A);
		for(int i=0;i<B.size();i++){
			System.out.print(B.get(i)+" ");
		}
		}
	}