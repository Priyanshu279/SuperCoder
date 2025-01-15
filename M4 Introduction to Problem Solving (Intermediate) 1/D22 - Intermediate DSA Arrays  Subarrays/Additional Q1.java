import java.util.*;

class Main {
    
    public static ArrayList<Integer> alternatingSubarrays(int A [],int B){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int N=A.length;
        int requiredLength=(2*B)+1;
        
        if(B==0){
            for(int i=0;i<N;i++){
                ans.add(i);
            }
            return ans;
        }
        
        for(int i=0,start=0;i<N-1;i++){
            int curr=A[i];
            int next=A[i+1];
            int currLength=i-start+2;
        
            if(curr==next){
                start=i+1;
            }else if((curr!=next) && (currLength>=requiredLength)){
                ans.add(start + B);
                start++;
            }
        }
        return ans;
    }
        
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int B=sc.nextInt();
        
        ArrayList<Integer> altArr=alternatingSubarrays(A,B);
        
        for(int i=0;i<altArr.size();i++){
            System.out.print(altArr.get(i)+" ");
        }
        
	}
}