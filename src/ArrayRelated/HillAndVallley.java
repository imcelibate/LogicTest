package ArrayRelated;

/*
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
 * 
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close
 *  attention to small details like topography. 
 *  During his last hike he took exactly  steps. 
 *  For every step he took, he noted if it was an uphill,U , 
 *  or a downhill,D  step. Gary's hikes start and end at sea level 
 *  and each step up or down represents a 1 unit change in altitude. 
 *  We define the following terms:

A mountain is a sequence of consecutive steps above sea level, 
starting with a step up from sea level and ending with a step 
down to sea level.
A valley is a sequence of consecutive steps below sea level, 
starting with a step down from sea level and ending with a step 
up to sea level.
Given Gary's sequence of up and down steps during his last hike, 
find and print the number of valleys he walked through.

For example, if Gary's path is DDUUUUDD, he first enters a valley 2 units deep. 
Then he climbs out an up onto a mountain 2 units high. Finally, 
he returns to sea level and ends his hike.
 */

public class HillAndVallley {
	
	public static void main(String arg[]) {
		System.out.println("Valley Count:::"+countingValleys(8, "UDDDUDUU"));
		
		
	}
	
	static int countingValleys(int n, String s) {
		int val = 0;
		boolean startVal = false;
		int ter = 0;
        for(char sc : s.toCharArray()) {        
        		if(sc == 'D') {  
        			if(ter ==0) {
        				startVal = true;	
        			}
        			ter = ter -1;
        		}else if(sc == 'U') {
        			ter = ter +1;
        		}
        
        	if(startVal && ter == 0) {
        		val = val + 1;
        		startVal = false;
        	}
        }

		return val;
    }

}
