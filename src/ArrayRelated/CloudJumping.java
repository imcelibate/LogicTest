package ArrayRelated;

/*
 * Emma is playing a new mobile game that starts with consecutively 
 * numbered clouds. Some of the clouds are thunderheads and others
 *  are cumulus. She can jump on any cumulus cloud having a number that
 *  is equal to the number of the current cloud plus 1 or 2.
 *   She must avoid the thunderheads. Determine the minimum number of 
 *   jumps it will take Emma to jump from her starting postion to the last
 *    cloud. It is always possible to win the game.
 *    For each game, Emma will get an array of clouds numbered 0  if they are
 *     safe or 1 if they must be avoided. For example, C = 0,1,0,0,0,1,0
 *     The number on each cloud is its index in the list so she must avoid 
 *     the clouds at indexes 1 and 5. She could follow the following 
 *     two paths: 0->2->4->6 or 0->2-3->4->6. The first path takes 3 jumps 
 *     while the second takes 4.
 */

public class CloudJumping {
	
	static int jumpingOnClouds(int[] c) {
		int jumpCnt = 1;
		if(c.length <=1) {
			return 0;
		}else if(c.length == 2) {
			return 1;
		}else {
			int ind = 2;
			int b4LastJmp = c[0];
			int lastJmp = c[1];
			boolean notDoubleJmpd = true;
			if(lastJmp == 1) {
				jumpCnt = 0;
			}
			do{
				int now = c[ind];
				if(now == 0) {
					jumpCnt = jumpCnt + 1;
					if(lastJmp ==0 && b4LastJmp ==0 && notDoubleJmpd) {
						jumpCnt = jumpCnt - 1;
						notDoubleJmpd = false;
					}else {
						notDoubleJmpd = true;
					}
				}
				b4LastJmp = lastJmp;
				lastJmp = now;
				ind = ind +1;
				
			}while(ind < c.length);
		}
		return jumpCnt;
    }
	public static void main(String[] args) {
		//int[] c = {0,0,0,0,1,0};
		//int[] c = {0,0,1,0,0,1,0};
		int[] c = {0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0};
		System.out.println("Minumum jump :"+jumpingOnClouds(c));
		
	}

}
