package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MostCommonElement {
	public static void main (String[] args) {
		// You can hit run at the top to test your code using the checker!
		Checker();
	}
	
    public static int findMostCommonElement(ArrayList<Integer> inputList) {
    	// numbers in input list are between 0 and 9 inclusive
    	// if there are two or more elements that appear the same 
    	//   amount of times, return the larger number
    	// your input will always be greater than size 0
    	return 0;
    }
    
    public static void Checker() {
    	ArrayList<Integer> test1 = new ArrayList<Integer>(Arrays.asList(1,1,2));
    	if (findMostCommonElement(test1) == 1) {
			System.out.println("Expected output matched actual output!");
    	} else {
    		System.out.println("Expected output of 3 did not match actual output of " + findMostCommonElement(test1));
    	}
    	
    	test1 = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,4,2,4,3,2,3));
    	if (findMostCommonElement(test1) == 4) {
			System.out.println("Expected output matched actual output!");
    	} else {
    		System.out.println("Expected output of 4 did not match actual output of " + findMostCommonElement(test1));
    	}

    	test1 = new ArrayList<Integer>(Arrays.asList(2,3,5,7,8,9,9,0,9,0));
    	if (findMostCommonElement(test1) == 9) {
			System.out.println("Expected output matched actual output!");
    	} else {
    		System.out.println("Expected output of 9 did not match actual output of " + findMostCommonElement(test1));
    	}
    }
}
