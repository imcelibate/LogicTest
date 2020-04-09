package StringRelated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Q1_MostFrequentKeyWord {
	
	public static void main(String arg[]) {
		System.out.println("Om AMMA");
		List<String> reviews = new ArrayList<String>();
		reviews.add("I love anacell Best services; Best services provided by anacell");
		reviews.add("betacellular has great services");
		reviews.add("deltacellular provides much better services than betacellular");
		reviews.add("cetracular is worse than anacell");
		reviews.add("Betacellular is better than deltacellular.");
		
		List<String> keywords = new ArrayList<String>();
		keywords.add("Anacell");
		keywords.add("Betacellular");
		keywords.add("cetracular");
		keywords.add("Deltacellular");
		keywords.add("eurocell");
		
		keywords.replaceAll(String::toLowerCase);
		
		
		
		Set<String> opSet = Q1_MostFrequentKeyWord.findFeq(reviews, keywords);
		Iterator<String> itr = opSet.iterator();
		int i = 0;
		while(itr.hasNext() && i < 2) 
		{
		    String value = itr.next();		     
		    System.out.println("Value: " + value);
		    i++;
		}
		
	}
	
     static NavigableSet<String> findFeq(List<String> reviews, List<String> keywords){
    	 TreeSet<String> opSet = new TreeSet<String>();
    	 Map<String, Integer> wordMap = new HashMap<String, Integer>();
    	 for(String review : reviews) {
    		 String[] words = review.replaceAll("[^a-zA-Z0-9]\\s", "").replace(".", "").split(" ");
    		   for(String word : words) {
    			   if(keywords.contains(word.toLowerCase())) {
    				   if(wordMap.containsKey(word.toLowerCase())) {
						   wordMap.put(word.toLowerCase(), wordMap.get(word.toLowerCase())+1);
					   }else {
						   wordMap.put(word.toLowerCase(), 1);
					   }
    				   
    			   }
    		   }
    	 }
    	 
    	 for(Entry<String, Integer> entrySet : wordMap.entrySet()) {    		 
    		 opSet.add(entrySet.getValue()+ "--" + entrySet.getKey());
    	 }
    	 NavigableSet<String> revOpSet = opSet.descendingSet();
    	 
    	 return revOpSet;
     }

}
