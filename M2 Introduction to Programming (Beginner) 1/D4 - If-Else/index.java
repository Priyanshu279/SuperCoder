import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if((n&1) == 1)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        
    }
}