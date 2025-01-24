import java.util.Scanner;

public class CountSpecialTriplets{

    public int solve(int[] A){
        int ans=0;
		
        for(int j=0;j<A.length;j++){
            int left=0;
			int right=0;
            for(int i=0;i<j;i++){
                if(A[i]<A[j]){
                    left++;
                }
            }
			
            for(int k=j+1;k<A.length;k++){
                if(A[k]>A[j]){
                    right++;
                }
            }

            ans=ans+(left*right);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] A=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        CountSpecialTriplets countSpecialTriplets=new CountSpecialTriplets();
        int result=countSpecialTriplets.solve(A);

        System.out.println("The number of special triplets is: " + result);
    }
}