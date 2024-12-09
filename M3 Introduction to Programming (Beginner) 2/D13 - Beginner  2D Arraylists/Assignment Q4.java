import java.util.*;

class Main {
	// Function to return a 2D arraylist with numeric staircase pattern
	/*
		N=4
		1
		12 
		123
		1234
	*/
	public static ArrayList<ArrayList<Integer>> staircasePattern(int N){
		ArrayList<ArrayList<Integer>> sP= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++){
			int size=i+1;
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int j=0;j<size;j++){
				l.add(j+1);
			}
			sP.add(l);
		}
		return sP;
	}
	
	public static void main(String args[]) {
		// Your code goes here
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();

			// for staircase pattern printing
			ArrayList<ArrayList<Integer>> pattern = staircasePattern(n);
			
			//printing staircase pattern
			for(int i=0;i<pattern.size();i++){
				for(int j=0;j<pattern.get(i).size();j++){
					System.out.print(pattern.get(i).get(j)+" ");
				}
				System.out.println();
			}
			
			//printing staircase by another way
			System.out.println(pattern);
			
		}
	}