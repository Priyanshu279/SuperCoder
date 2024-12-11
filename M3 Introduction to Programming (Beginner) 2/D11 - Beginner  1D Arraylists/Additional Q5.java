import java.util.*;

class Main {
	public static ArrayList<Integer> countFrequency(ArrayList<Integer> A){
		ArrayList<Integer> B=new ArrayList<Integer>();
		int size=A.size();
		for(int i=0;i<size;i++){
			int f=0;
			for(int j=0;j<size;j++){
				if(A.get(i)==A.get(j)){
					f++;
				}
			}
			B.add(f);
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
	
		ArrayList<Integer> B=countFrequency(A);
		for(int i=0;i<B.size();i++){
			System.out.print(B.get(i)+" ");
		}
	}
}