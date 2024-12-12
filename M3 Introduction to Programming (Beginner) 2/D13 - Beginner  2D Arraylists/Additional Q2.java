import java.util.*;

class Main {
	public static ArrayList<ArrayList<Integer>> matrixMultiplyByB(ArrayList<ArrayList<Integer>> A,int B){
		int N=A.size();
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		
		for(int row=0;row<N;row++){
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int col=0;col<A.get(row).size();col++){
				l.add(A.get(row).get(col)*B);
			}
			arr.add(l);
		}
		return arr;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		int n=sc.nextInt();
		
		for(int row=0;row<n;row++){
			int size=sc.nextInt();
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int col=0;col<size;col++){
				l.add(sc.nextInt());
			}
			A.add(l);
		}
		
		int B=sc.nextInt();
		
		ArrayList<ArrayList<Integer>> ans = matrixMultiplyByB(A,B);
		
		for(int i=0;i<ans.size();i++){
			for(int j=0;j<ans.get(i).size();j++){
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}