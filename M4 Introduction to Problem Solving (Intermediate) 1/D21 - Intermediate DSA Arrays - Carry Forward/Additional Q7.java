import java.util.*;

class Main{
    public static int bulbs(int A[]){
        
        int N=A.length;
        int toggleCount=0;
        
        for(int i=0;i<N;i++){
            if((A[i]+toggleCount)%2==0){
                toggleCount++;
            }
        }
        return toggleCount;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int ans=bulbs(A);
        System.out.println(ans); 
	}
}