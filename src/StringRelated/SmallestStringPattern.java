package StringRelated;

import java.util.*;

public class SmallestStringPattern {
	
 public static void main(String arg[]) {
	 
	findSmallestSub("ababab");
	findSmallestSub("ababrababrababr");
	findSmallestSub("aabaababc");	
	findSmallestSub("abcd");
	findSmallestSub("aaaaaa");
	 
 }
 
    static void findSmallestSub(String str) {
    	String subStr = str.substring(0,1);
   	 String nextSubStr = str.substring(1,2);
   	 int indx = 1;
   	 boolean matchedTillHalf = false;
   	 while(indx <=str.length()/2) {		  
   		 if(subStr.equals(nextSubStr)) {
   		   String[] checkFullFill = str.split(subStr);
   		   if(checkFullFill.length == 0) {
   			   matchedTillHalf = true;
   			   break;
   		   }
   		 }else {
   			 matchedTillHalf = false;			 
   		 }
   		 indx = indx +1;
   		 subStr = str.substring(0,indx);
   		 if(indx+subStr.length()<=str.length()) {
   		 nextSubStr = str.substring(indx,indx+subStr.length());
   		 }else {
   			break;
   		 }
   	 }
   	 
   	 if(matchedTillHalf) {
   		System.out.println("Smallest Substring for "+str+" is :::"+subStr);
   	 }else {
   		System.out.println("Smallest Substring for "+str+" is ::: NULL");
   	 }
   	 
   	 
    }

}
