import java.util.*;

class Main {
	
	public static int[] minMax(int arr[]){
		int n=arr.length;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}else if(arr[i]<min){
				min=arr[i];
			}
		}
		return new int[]{max,min};
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
		int result[]=minMax(arr);
		System.out.println(result[0]+" "+result[1]);
	}
}