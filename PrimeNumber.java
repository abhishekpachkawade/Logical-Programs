
/*
Prime Number
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
*/

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//variable type integer
		int check = 0;
		Scanner scan = new Scanner(System.in);
		//ask to user Enter the number
		System.out.println("Enter a Number");
		//store the in number
        int number = scan.nextInt();
        //close scanner 
        scan.close();
        
        //for loop check the number is prime or not 
        for (int i = 2; i < number; i++) {
            int prime = number % i;
            //if else statement 
            if (prime == 0) {
                check = 0;
                break;
            } else {
                check = 1;
                break;
            }
        }
        
        //if else condition check ==0 means number is not prime
        if (check == 0) {
            System.out.println("Number is not prime");
        } else {
        	System.out.println("Number is prime");
        }
        
	}

 }



/*
OUTPUT
Enter a Number
24
Number is not prime

OR
Enter a Number
7
Number is prime

*/

