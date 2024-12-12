import java.util.*;

class Main {
	 public static ArrayList<ArrayList<Integer>> multiplesOfEach(ArrayList<Integer> A,ArrayList<Integer> B){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<B.size();i++){
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int j=0;j<A.size();j++){
				if(A.get(j)%B.get(i)==0){
					l.add(A.get(j));
				}
			}
			result.add(l);
		}
		return result;
	 }
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> A=new ArrayList<Integer>();
		int n1=sc.nextInt();
		
		ArrayList<Integer> B=new ArrayList<Integer>();
		int n2=sc.nextInt();
		
		for(int i=0;i<n1;i++){
			A.add(sc.nextInt());
		}
		
		for(int i=0;i<n2;i++){
			B.add(sc.nextInt());
		}
		
		ArrayList<ArrayList<Integer>> ans = multiplesOfEach(A,B);
		
		for(int i=0;i<ans.size();i++){
			for(int j=0;j<ans.get(i).size();j++){
				System.out.print(ans.get(i).get(j)+" ");
			}
		System.out.println();
		}
	}
}