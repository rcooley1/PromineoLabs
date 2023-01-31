package arraysLab;

public class Week3Lab {

	public static void main(String[] args) {
		
		//create an array with the following values: 1, 5, 2, 8, 13, 6
		int [] numArray = {1, 5, 2, 8, 13, 6};
		//print out the first element in the array
		System.out.println(numArray[0]);
		//print out the last element of the array without using the number 5
		System.out.println(numArray[numArray.length-1]);
		//print out the element in the array at position 6. What happens?
		//System.out.println(numArray[6]); (gives an error
		//write a traditional for loop that prints out each element in the array.
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
			if (i == 5) {
				System.out.println(".");
			}
		}
		//write an enhanced for loop that prints out each element in the array,
		for(int num : numArray) {
			System.out.print(num + " ");
		}
		System.out.println();
		//create a new variable called sum, write a loop that adds each element in the array to the sum.
		int sum = 0;
		for(int num : numArray) {
			sum += num;
		}
		System.out.println(sum);
		//create a new variable called average and assign the average of the array to it. 
		int average = sum/numArray.length;
		System.out.println(average);
		//write an enhanced for loop that prints out each number in the array only if it is odd. 
		for (int num : numArray) {
			if ((num % 2) != 0) {
				System.out.print(num);
			}
		}
		//Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert".
		String[] names = { "Sam", "Sally", "Thomas", "Robert" };
		//calculate the sum of all the letters in the new array.
		int sumOfNames = 0 ;
		for(String name : names) {
			sumOfNames += name.length();
		} System.out.println(sumOfNames);
		
		String name = "Robert";
		greeting("Robert");
	
		concatGreeting("Robert");
		//We need to use sysout in order to have this method print.
		System.out.println(concatGreeting("Robert"));
		
		System.out.println(stringIntCompare("sup", 5));
		System.out.println(stringIntCompare("Longer word", 3));
		System.out.println("--------------------------");
		
		String[] words = {"bee", "spider", "ant", "person"};
		System.out.println(containsString(words, "robert"));
		System.out.println(containsString(words, "spider"));
		System.out.println("--------------------------");
		
		double[] dubArr = {12.5, 14.7, 2.9, 3.8};
		System.out.println(doubleAverage(dubArr));
		
		int[] nameLengths = lengthOfString(words);
		for(int length : nameLengths) {
			System.out.println(length);
		}
		
		System.out.println("----------------");
		System.out.println(evenIsGreater(words));
		System.out.println("-------------------");
		
		String notPalindrome = "Hello";
		String palindrome = "racecar";
		System.out.println(palindrome(notPalindrome));
		System.out.println(palindrome(palindrome));
		
	}
	
	
	//write and test a method that takes a string name and prints out a greeting, this method returns nothing.
	public static void greeting(String name) {
	System.out.println("Hello, " + name + "!");
	}
	//write and test a method that takes a String name and returns a greeting, do not print in the method.
	public static String concatGreeting(String name) {	
		return "Hi, " + name + "!";
	}
	//write and test a method that takes a String and int and returns true if the number of letters in the string is greater than the int.
	public static boolean stringIntCompare(String word, int x) {
		return (word.length() > x);
	}
	//write and test a method that takes an array of string and a string and returns true if the strong passed in exists in the array.
	public static boolean containsString(String[] words, String otherWord) {
		for (String word : words) {
			if( word == otherWord) {
				return true;
			}
		}
		return false;
	}
	//write and test a method that takes an array of int and returns the smallest number in the array.
	public static int smallestNumber(int[] nums) {
		int smallest = nums[0];
		for (int number : nums) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	//write and test a method that takes an array of double and returns the average,
	public static double doubleAverage(double[] dubArr) {
		int sum = 0;
		for (double num : dubArr) {
			sum += num;
		} return sum/dubArr.length;
		
	}
	//wire ant test a method that takes an array of Strings and returns an array of int where each element matches the length of the string at that oinstance. 
	public static int[] lengthOfString (String[] words) {
			int[] results = new int[words.length];
			for(int i = 0; i < words.length; i++) {
			results[i] = words[i].length();
}
	return results;
	}
	//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an 
	//even amount of letters is greater than the sum of those with an odd amount of letters.
	public static boolean evenIsGreater(String[] words) {
		int evenSum = 0;
		int oddSum = 0;
		for (String word : words) {
			if (word.length() % 2 == 0) {
				evenSum += word.length();
			} else oddSum += word.length();
		}
		return evenSum > oddSum;
	}
	//write and test a method that takes a string and returns true if the string is a palindrome.
	public static boolean palindrome(String testWord) {
		for(int i = 0; i < testWord.length(); i++) {
		if (testWord.charAt(i) != testWord.charAt(testWord.length() - i - 1)) {
			return false;
		}
	}
		return true;
}	
}

