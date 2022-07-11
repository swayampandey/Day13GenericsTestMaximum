package genericsmaximum;
import java.util.Scanner;
/**
 * 
 * @author dell
 *this program will compare three numbers by taking user input and print the maximum number using generic parameters 
 */
public class GenericsMaximum {
	
	/**
	 * creating object of scanner class to take user input
	 */

	static Scanner sc = new Scanner(System.in);

	public static int maximum(Integer a, Integer b, Integer c) {
		/**
	     * This method will compare numbers and print the results
	      */
		Integer max = a;
		if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
			max = b;
		else if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
	public static void main(String[] args) {
		 /*
        * Storing three input numbers given by user
        * variable x,y and z stores three numbers 
        */
		
		System.out.println("<< FInding maximum numbers by using generics >>");
		System.out.println("Enter first number ");
		Integer x = sc.nextInt();
		System.out.println("Enter second number ");
		Integer y = sc.nextInt();
		System.out.println("Enter third number ");
		Integer z = sc.nextInt();
		System.out.println("Maximum in entered numbers is " + maximum(x, y, z));
	}
}
