import java.util.*;

public class Main {
    public int majorityElement(final int[] A) {
        int currEle = A[0];
        int currFreq = 1;

        for(int i=1; i<A.length; i++){
            if(currEle==A[i]){
                currFreq++;
            }else{
                currFreq--;
            }

            if(currFreq==0){
                currEle=A[i];
                currFreq=1;
            }
        }
        return currEle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MajorityElementFinder finder=new MajorityElementFinder();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] A=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            A[i] = sc.nextInt();
        }

        int result=finder.majorityElement(A);
        System.out.println("The majority element is: " + result);
    }
}
