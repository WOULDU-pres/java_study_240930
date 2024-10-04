package day4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Loop_Stars {
	    public static void main(String[] args) {
	    	
	    	for(int i = 5; i>=1;i--) {
	    		for(int j = 5; j>=1; j--) {
	    			System.out.print("*");
	    			if(i==j) {
	    				break;
	    			}
	    		}
	    		System.out.println();
	    	}
	    	
	    	System.out.println("\n--- GOOD ---\n");
	    	

	    	for(int i = 5; i>=1;i--) {
	    		for(int j = 1; j<=5;j++) {
	    			System.out.print("*");
	    			if(i==j) {
	    				break;
	    			}
	    		}
	    		System.out.println();
	    	}
	    	
	    	System.out.println("\n--- GOOD ---\n");
	    	

	    	for(int i = 1; i<=5;i++) {
	    		for(int j = 1; j<=5;j++) {	 
	    			if(i <= j) {
	    				System.out.print("*");
	    			} else {
	    				System.out.print(" ");
	    			}
	    		}
	    		System.out.println();
	    	}
	    	
	    	
    }
}
