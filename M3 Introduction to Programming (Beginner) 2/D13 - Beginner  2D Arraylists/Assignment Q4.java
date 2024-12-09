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
			// creation of 2d arraylist
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			
			//No of arraylist inside list(2d array)
			int n=sc.nextInt();
		
			for(int i=0;i<n;i++){
				//Add logic to take an arraylist as input
				int size=sc.nextInt();
				ArrayList<Integer> l=new ArrayList<Integer>();
				for(int j=0;j<size;j++){
					l.add(sc.nextInt());
				}
				//and add it to 2D arraylist
				list.add(l);
			}
			
			//printing 2d arraylist
			for(int i=0;i<list.size();i++){
				// Print ith list
				for(int j=0;j<list.get(i).size();j++){
					System.out.print(list.get(i).get(j)+" ");
				}
				System.out.println();
			}
			
			//printing 2d array by another way
			System.out.println(list);
			
			// for staircase pattern printing
			ArrayList<ArrayList<Integer>> pattern = staircasePattern(n);
			
			//printing staircase pattern
			for(int i=0;i<pattern.size();i++){
				// Print ith list
				for(int j=0;j<pattern.get(i).size();j++){
					System.out.print(pattern.get(i).get(j)+" ");
				}
				System.out.println();
			}
			
			//printing staircase by another way
			System.out.println(pattern);
			
		}
	}