package StringRelated;

public class StringRepeatNTimesFindACharacterCount {
	
	public static void main(String arg[]) {
		System.out.println("STarted");
		Long Start = System.currentTimeMillis();
		counter("aab", 100000017);
		System.out.println("Time for 1:"+(System.currentTimeMillis() - Start)/1000);
		
		Start = System.currentTimeMillis();
		counterEffecinet("aab", 100000017);
		System.out.println("Time for 2:"+(System.currentTimeMillis() - Start)/1000);		
		
	}
	
	static void counter(String s, int n) {
		StringBuffer temp= new StringBuffer(s);
		
		while(temp.length() < n) {
			temp = temp.append(s);
		}
		
		temp = new StringBuffer(temp.substring(0, n));//.substring(0,n);
		int count = 0;
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == 'a') {
				count = count + 1;
			}
		}
		
		System.out.println("Count of a = "+count);
	}
	
	static void counterEffecinet(String s, int n) {
		int aCount = 0;
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				aCount = aCount + 1;
			}
		}
		
		int div = n/s.length();
		aCount = aCount * div;
		
		int rem = n%s.length();
		for(int i=0; i < rem; i++) {
			if(s.charAt(i) == 'a') {
				aCount = aCount + 1;
			}
		} 
		
		System.out.println("Count of a = "+aCount);
		
	}
	
	

}
