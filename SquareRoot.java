
package algorithmday1;

import java.util.Scanner;

public class SquareRoot {

	 // Babylonian method - iterative method that gradually approaches the true square root   

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = scanner.nextDouble();
		
		double squareRoot = sqrt(num);
		System.out.println("Square root of " + num + " is " + squareRoot);
	}

	public static double sqrt(double num) {
		
		//bigO = n
	    if (num < 0) {
	        System.out.println("Square root of negative number is undefined.");
	        return Double.NaN;
	    }
	    if (num == 0) {
	        return 0;
	    }
	    
	    double x = num;
	    double y = 1;
	    double precision = 0.001; // choose a precision level
	    
	    //n/2
	    while (Math.abs(x - y) > precision) {
	        x = (x + y) / 2; // calculate the mid point
	        y = num / x;
	    }
	    return x;
	}
}




