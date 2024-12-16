import java.util.*;

class Main {
    public static void maxMinOFArray(int A[]){
        int N=A.length;
        int max=A[0];
        int min=A[0];
        for(int i=0;i<N;i++){
            if(A[i]>max){
                max=A[i];
            }else if(A[i]<min){
                min=A[i];
            }
        }
        System.out.println(max+" "+min);
    }
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        maxMinOFArray(A);
	}
}