import java.util.*;

class Main {
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
	
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int val=sc.nextInt();
			arr.add(val);
		}
		
		int x=sc.nextInt();//position
		int y=sc.nextInt();//element
		
		arr.add(x-1,y);
		
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
	}
}