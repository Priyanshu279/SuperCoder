import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int rating=sc.nextInt();
		
		if(rating>=2100){
			if(rating%2==0){
				System.out.println("GRAND MASTER");
			}else{
				System.out.println("grand master");
			}
		}
		else if(rating>=1900){
			if(rating%2==0){
				System.out.println("CANDIDATE MASTER");
			}else{
				System.out.println("candidate master");
			}
		}
		else if(rating>=1600){
			if(rating%2==0){
				System.out.println("EXPERT");
			}else{
				System.out.println("expert");
			}
		}
		else if(rating>=1400){
			if(rating%2==0){
				System.out.println("PUPIL");
			}else{
				System.out.println("pupil");
			}
		}
		else{
			if(rating%2==0){
				System.out.println("NEWBIE");
			}else{
				System.out.println("newbie");
			}
		}
	}
}