package ArrayRelated;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


import java.io.BufferedWriter;

/*
 * 
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
 * 
 John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers describing the colors  of the socks in the pile.
Constraints
Sample Input : 
n = 9
int[] ar = {10,20,20,10,10,30,50,10,20};
Sample Output:
3
 */


public class SocksPair {
	private static final Scanner scanner = new Scanner(System.in);
	
	 public static void main(String[] args) throws IOException {
	        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n= 9;
	        int[] ar = {10,20,20,10,10,30,50,10,20};

	        int result = sockMerchant(n, ar);
	        System.out.println("Resut "+result);
	    }
	 
	// Complete the sockMerchant function below.
	    static int sockMerchant(int n, int[] ar) {
	    	int pairs = 0;
	    	List types = new ArrayList();
	        for(int i : ar) {
	        	if(types.contains(i)) {
	        		pairs = pairs+1;
	        		types.remove(Integer.valueOf(i));
	        	}else {
	        		types.add(i);
	        	}
	        }

             return pairs;
	    }

}
