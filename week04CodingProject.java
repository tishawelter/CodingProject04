package homeworkCodingProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class week04CodingProject {

	public static void main(String[] args) {
		
	//Q1 created an array with given values 
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
	//Q1a following will subtract last element from the first element & print to result
		System.out.println("Q1 -----");
		int sum = (ages[ages.length - 1] - ages[0]);
			System.out.println(sum);
		
	//Q1b created a new array with nine elements
		
		int[] ages2 = {2, 4, 7, 12, 26, 33, 47, 51, 63};
		
	/* Q1bii & iii
		 * the following will subtract value of first element from last, printed to confirm
		
			int num = (ages2[ages2.length - 1] - ages2[0]);
				System.out.println(num);
	*/
		
	//Q1c
		System.out.println("Q1c -----");
		int num = 0;
		
		for (int number : ages2) {
			num += number;
		}
		/* print results
		 * tested print to show total before finding average
		 * System.out.println(num);
		 */
		System.out.println(num / ages2.length);
		
	//Q2 create a String array with specified values
		System.out.println("Q2 -----");
		String[] names = new String[6];
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
			
			int totalLength = 0;
			for (String name : names) {
				totalLength += name.length();
			}
				System.out.println(totalLength);
				int average = totalLength / names.length;
				
				System.out.println(average);
				
	//Q2b created a loop to iterate array and concatenate all names together
		System.out.println("Q2b -----");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
				
	//Q3 how do you access the last element of any array?
		System.out.println("\nQ3 answer:  you access the last element of any array using the length property - 1");
			
	//Q4 how do you access the first element of any array?
		System.out.println("Q4 answer: you access the first element of any array using [0] index");
			
	//Q5 create a new int array with a loop iterating through names array and add length of each name
			
		int[] nameLengths = new int[names.length];
		
		for (String name : names) {
			int length = name.length();
				System.out.println(name + " " + length);
		}	
		
	//Q6 loop that iterates the names in the array and finds the total elements
		System.out.println("Q6 -----");
		int total = 0;
		// for loop which runs through all names adding the lengths together
		for (int length : nameLengths) {
				total += length;
		}
			System.out.println("The sum of all elements in nameLengths array: " + total);
	}
	
	//Q7 method takes a given string and a number and prints out the word concatenated to itself the number of times
		public static String repeatWord(String word, int n) {
			String newString = new String();
			// for loop which goes through the number given, creating a new string of the entered word
			for (int i = 0; i < n; i++) {
				newString += word;
			}
			// returns the new string
			return newString; 
		}
		
	//Q8 method takes a first name and last name and returns the full name separated with a space
		public static String createFullName(String firstName, String lastName) {
			return (firstName + " " + lastName);
		}
		
	//Q9 boolean method to return true if all the elements in the array are greater than 100
		public static boolean sumGreaterThan(int[] arr) {
			int sum = 0;
			// for loop to find the total of all the elements in the array
			for (int num : arr) {
				sum += num;
			}
			// return true if total is greater than 100
			return sum > 100;
		}
		
	//Q10 method that returns the average of all the elements in the array
		public static double findAverage(double[] arr) {
			double sum = 0;
			// for loop to find the total of all the elements in the array
			for (double num : arr) {
				sum += num;
			}
			// return the total divided by the array length to find the average
			return sum / arr.length;
		}
		
	//Q11 a boolean method which returns true if the average in the first array is greater than the second array
		public static boolean greaterThan(double[] array1, double[] array2) {
			double avg1 = 0;
			double avg2 = 0;
			// for loop that determines the average of array1
			for (double num : array1) {
				avg1 += num;
			}
			// for loop that determines the average of array2
			for (double num : array2) {
				avg2 += num;
		}
			// return true if array1 average is greater than array2 average
			return avg1 > avg2;
		}
			
	//Q12 a boolean method that will return true if its to hot and you have enough money to buy a drink
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			//if statement to determine if it's hot outside and there more than $10.50 for a drink
			if (isHotOutside && moneyInPocket > 10.50) {
				return true;
			} else
				return false;
		}
			
	//Q13 a method that finds the larger of two numbers
		public static int largestNumber(int a, int b) {
			// if statement determines if number 1 is larger than number 2
			if (a > b) {
				return a;
			} 
			// will return number 2 when the if statement is false
			else 
				return b;
		}
		
}		
		

	


