import java.util.*;

class Main {
	public static ArrayList<Integer> solve(int A){
		ArrayList<Integer> aList=new ArrayList<Integer>();
		for(int i=1;i<=A;i++){
			if(isArmstrong(i)){
				aList.add(i);
			}
		}
		return aList;
	}
	
	public static boolean isArmstrong(int A){
		int sum=0;
		int temp=A;
		int rem=0;
		while(temp>0){
			rem=temp%10;
			sum+=(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==A){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		ArrayList<Integer> arr=solve(A);
		
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
	}
}
