import java.util.*;

class Main {
	
	public static ArrayList<Integer> divisibleBy5_7(ArrayList<Integer> arr){
		int n=arr.size();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(arr.get(i)%5==0 && arr.get(i)%7==0){
				ans.add(arr.get(i));
			}
		}
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		
        while (true) {
            int val = sc.nextInt();
            if (val == -1) { // Termination condition
                break;
            }
            A.add(val);
        }
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		result=divisibleBy5_7(A);
		System.out.println(result);
	}
}