import java.util.*;

class Main {
    public static ArrayList<ArrayList<Integer>> allSubArrays(int A[]){
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        int N=A.length;
        for(int s=0;s<N;s++){
            for(int e=s;e<N;e++){
                ArrayList<Integer> l=new ArrayList<Integer>();
                for(int i=s;i<=e;i++){
                    l.add(A[i]);
                }
                arr.add(l);
            }
            
        }
        return arr;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        ArrayList<ArrayList<Integer>> ans=allSubArrays(A);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
	}
}