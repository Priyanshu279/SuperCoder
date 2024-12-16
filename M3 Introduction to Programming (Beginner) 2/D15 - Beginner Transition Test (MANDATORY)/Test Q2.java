import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            String A=sc.next();
            int cnt=0;
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)>='A'&& A.charAt(i)<='Z'){
                    cnt++;
                }
            }
            System.out.println(cnt);
            T--;
        }
	}
}