import java.util.*;

public class Main{
    public static String convertDecimalToBase(int A, int B){
        
        if(A==0){
            return "0";
        } 

        StringBuilder result=new StringBuilder();
       while(A>0){
            int remainder=A%B;
            result.append(remainder);
            A /= B;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A1=sc.nextInt();
        int A2=sc.nextInt();
        int B1=sc.nextInt();
        int B2=sc.nextInt();

        System.out.println("Output 1: " + convertDecimalToBase(A1, B1));
        System.out.println("Output 2: " + convertDecimalToBase(A2, B2));
    }
}
