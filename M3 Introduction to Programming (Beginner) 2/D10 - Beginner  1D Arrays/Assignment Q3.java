import java.util.*;

class Main {
	
	public static int sumOfElements(int arr[]){
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if (n <= 0){
    		System.out.println("Invalid input size.");
    		return;
		}

		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int totalElementSum=sumOfElements(arr);
		System.out.println(totalElementSum);
	}
}