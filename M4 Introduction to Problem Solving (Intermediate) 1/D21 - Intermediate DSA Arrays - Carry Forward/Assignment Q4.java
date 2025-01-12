import java.util.*;

class Main {
    
    public static int lenghtOfClosestMinMax(int A[]){
        int N=A.length;
        int maxIndex=-1;
        int minIndex=-1;
        int ansLength=N+1;
        int maxVal=A[0];
        int minVal=A[0];
        
        for(int i=0;i<N;i++){
            if(A[i]>maxVal){
                maxVal=A[i];
            }
            else if(A[i]<minVal){
                minVal=A[i];
            }
        }
        
        for(int i=N-1;i>=0;i--){
            if(A[i]==minVal){
                minIndex=i;
                if(maxIndex!=-1){
                    ansLength=Math.min(ansLength,(maxIndex-minIndex)+1);
                }
            }
            else if(A[i]==maxVal){
                maxIndex=i;
                if(minIndex!=-1){
                    ansLength=Math.min(ansLength,(minIndex-maxIndex)+1);
                }
            }
        }
        return ansLength;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int length=lenghtOfClosestMinMax(A);
        System.out.println(length);
        
	}
}