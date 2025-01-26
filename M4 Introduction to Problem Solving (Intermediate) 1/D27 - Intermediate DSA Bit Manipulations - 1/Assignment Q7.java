import java.util.*;

class Main {
    public int convertToDecimal(int A, int B){
        int ans=0;
        int power=0;
        
        while(A>0){
            int digit=A%10;
            decimalValue += digit * Math.pow(B, power);
            A /= 10;
            power++;
        }
        return decimalValue;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int ans=decimal(A,B);
        System.out.println(ans);
	}
}