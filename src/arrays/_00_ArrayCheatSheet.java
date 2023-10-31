package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stuff = {"Jed", "Sarah", "Kailin", "Jedjr", "Molly"};
		
		//2. print the third element in the array
		System.out.println(stuff[2]);
		
		//3. set the third element to a different value
		stuff[2] = "KK";
		
		//4. print the third element again
		System.out.println(stuff[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}
		
		
		//6. make an array of 50 integers
		int[] moreInts = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		
		for (int i = 0; i < moreInts.length; i++) {
			moreInts[i] = rand.nextInt(1, 51);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int lowest = 51;
		for (int i = 0; i < moreInts.length; i++) {
			if (moreInts[i] <= lowest) {
				lowest = moreInts[i];
			}
		}
		System.out.println(lowest);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(moreInts));
		
		//10. print the largest number in the array.
		int highest = 0;
		for (int i = 0; i < moreInts.length; i++) {
			if (moreInts[i] >= highest) {
				highest = moreInts[i];
			}
		}
		System.out.println(highest);
	}
	
}
