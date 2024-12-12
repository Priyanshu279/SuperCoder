import java.util.*;

class Main {
	public static ArrayList<Integer> sumOfRowCol(ArrayList<ArrayList<Integer>> A){
		int N=A.size();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		// Calculate sum of each row
		for(int row=0;row<N;row++){
			int sum=0;
			for(int col=0;col<A.get(row).size();col++){
				sum=sum+A.get(row).get(col);
			}
			arr.add(sum);
		}
		
		// Calculate sum of each column
        int maxColumns = 0;
        for (ArrayList<Integer> row : A) {
            maxColumns = Math.max(maxColumns, row.size());
        }
		
		for(int col=0;col<maxColumns;col++){
			int sum=0;
			for(int row=0;row<N;row++){
				if (col < A.get(row).size()) { // Check if the column exists in the current row
                	sum += A.get(row).get(col);
                }
			}
			arr.add(sum);
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
		
		ArrayList<Integer> ans = sumOfRowCol(A);
		
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i)+" ");
		}
	}
}