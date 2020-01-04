package ArrayRelated;


import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {
	
	public static void main(String arg[]) {
		System.out.println("OM AMMA");

		String s = "abc";
		String t = "abc";
		
		if(s.contains(t)){
			String tempT = t+t;	
			String tempS = s+s;
			if(tempS.contains(tempT)) {
				List l = new ArrayList();
				for(int i = 0 ; i <= t.length()-1 ; i++) {
					if(l.toString().equalsIgnoreCase(t)) {
						break;
					}else {
						l.add(t.charAt(i));
					}					
				}
				List l2 = new ArrayList();
				for(int i = 0; i <l.size() ; i++) {
					if(l2.contains(l.get(i))) {
						break;
					}else {
						l2.add(l.get(i));
					}
				}				
				System.out.println(l2.size());
				
			}else{
				System.out.println("-1");
			}
		}else {
			System.out.println("-1");
		}
		
	}	

}
