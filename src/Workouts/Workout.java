package Workouts;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Workout extends myException {
	public static void main(String[] args) {

		int n = 6; // Number of Fibonacci numbers to print
		int first = 0, second = 1;

		System.out.print("Fibonacci Series for " + n + " positions: ");
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;

		}
		
		//Palindrome
		int number = 12321; // Change this number to the one you want to check

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
		
		//Amstrong
		int aNum = 153; // Change this number to check different numbers

        if (isArmstrongNumber(aNum)) {
            System.out.println(aNum + " is an Armstrong number.");
        } else {
            System.out.println(aNum + " is not an Armstrong number.");
        }
        
        //Bubblesort
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
        
        
        //Functional Interface
        
        // Predicate to check if a number is greater than 10
        Predicate<Integer> isGreaterThan10 = num -> num > 10;

        System.out.println(isGreaterThan10.test(5));   // Output: false
        System.out.println(isGreaterThan10.test(15));  // Output: true
        
        // Function to square a number
        Function<Integer, String> squareFunction = num -> "Number is"+ num;

        System.out.println(squareFunction.apply(5));   // Output: 25
        System.out.println(squareFunction.apply(8));   // Output: 64
        
        // Supplier to generate a random number
        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());  // Output: (some random double value)
        System.out.println(randomSupplier.get());  // Output: (another random double value)
        
        // Consumer to print a message
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        printMessage.accept("Hello, Consumer!");  // Output: Message: Hello, Consumer!
        
        

	}

	// Function to check if a number is a palindrome
	public static boolean isPalindrome(int num) {
		int originalNum = num;
		int reversedNum = 0;

		while (num > 0) {
			int remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}

		return originalNum == reversedNum;

	}
	
	// Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0;
        int n = 0;

        originalNumber = num;

        // Calculate result
        while (num > 0) {
            remainder = num % 10;
            result += remainder*remainder*remainder;
            num /= 10;
        }

        return (originalNumber == result);
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                  	  arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//Output 0,1,1,2,3,5