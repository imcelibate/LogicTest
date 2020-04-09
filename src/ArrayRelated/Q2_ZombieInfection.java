package ArrayRelated;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2_ZombieInfection {
	
	/*
	 * Given a 2D grid, each cell is either a zombie 1 or a human 0. Zombies can turn adjacent (up/down/left/right) human beings into zombies every hour. Find out how many hours does it take to infect all humans?

Example:

Input:
[[0, 1, 1, 0, 1],
 [0, 1, 0, 1, 0],
 [0, 0, 0, 0, 1],
 [0, 1, 0, 0, 0]]

Output: 2

Explanation:
At the end of the 1st hour, the status of the grid:
[[1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1],
 [0, 1, 0, 1, 1],
 [1, 1, 1, 0, 1]]

At the end of the 2nd hour, the status of the grid:
[[1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1],
 [1, 1, 1, 1, 1]]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] line1 = {0,1,1,0,1};
//		Integer[] line2 = {0,1,0,1,0};
//		Integer[] line3 = {0,0,0,0,1};
//		Integer[] line4 = {0,0,0,0,0};
		
		
		Integer[] line1 = {0,0,1,0,1};
		Integer[] line2 = {0,0,0,1,0};
		Integer[] line3 = {0,0,0,0,1};
		Integer[] line4 = {0,0,0,0,0};
		
		ArrayList<List<Integer>> ip = new ArrayList<List<Integer>>();
		
		ip.add(Arrays.asList(line1));
		ip.add(Arrays.asList(line2));
		ip.add(Arrays.asList(line3));
		ip.add(Arrays.asList(line4));
		
		int itr = 0;
		Boolean isInfected = true;
		while(isInfected) {
			 for(List<Integer> line : ip) {
				 System.out.println(Arrays.toString(line.toArray()));				 
			 }
			 System.out.println();
			
			
			Map<Boolean, ArrayList<List<Integer>>> op = infect(ip);
			Map.Entry<Boolean, ArrayList<List<Integer>>> entry = op.entrySet().iterator().next();
			isInfected = entry.getKey();
			ip = entry.getValue();
			itr++;
			
		}
		
		System.out.println("Hours ::: "+itr);
		

	}
	
	 static Map<Boolean,ArrayList<List<Integer>>> infect(ArrayList<List<Integer>>  pop){
		// List<List<Integer>> op = new ArrayList<List<Integer>>();
		 
		 ArrayList<List<Integer>> tmpPop = new ArrayList<List<Integer>>();
		 
		 for(List<Integer> line : pop) {
			 List<Integer> newLine = new ArrayList<Integer>();
			 for(Integer i : line) {
				 newLine.add(i);			 
			 }
			 tmpPop.add(newLine);
		 }
		 
		 Boolean infected = false;
		 for(int i = 0; i < pop.size(); i++) {
			 for(int j=0; j < pop.get(i).size() ; j++) {
				 if(pop.get(i).contains(1)) {
					 if(pop.get(i).get(j) == 1) {
						int prevI = i - 1;
						int prevJ = j - 1;
						int nextI = i + 1;
						int nextJ = j + 1;
						if(prevI >= 0 && pop.get(prevI).size() > j) {
							if(pop.get(prevI).get(j) == 0) {
								tmpPop.get(prevI).set(j, 1);
								infected = true;								
							}			
							
						}
						if(pop.size()> nextI) {
							if(pop.get(nextI).get(j) == 0) {
								tmpPop.get(nextI).set(j, 1);
								infected = true;								
							}
						}
						if(pop.get(i).size()> nextJ) {
							if(pop.get(i).get(nextJ) == 0) {
								tmpPop.get(i).set(nextJ, 1);
								infected = true;								
							}
						}
						
						if(prevJ >=0) {
							if(pop.get(i).get(prevJ) == 0) {
								tmpPop.get(i).set(prevJ, 1);
								infected = true;								
							}
						}
						 
						 
					 }
					 
				 }
				 
			 }
		 }
		 Map<Boolean, ArrayList<List<Integer>>> op = new HashMap<Boolean, ArrayList<List<Integer>>>();
		 op.put(infected, tmpPop);
		 
		 return op;
		 
	 }

}
