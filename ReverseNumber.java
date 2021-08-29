
/*
Reverse a number
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.

*/

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//ask to user enter the number 
		System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        //store the value number1
        int number1 = scan.nextInt();
        //calling static method Reverse
        Reverse(number1);
        //close scanner class 
        scan.close();
	}
	
	//static method name is Reverse with passing one parameter with th type interger 
	static void Reverse(int number1)
	{	
		//instance variable also called as constant 
		int Remainder =0;
		int reverse =0;
		//while loop calculate the Remainder  
		while(number1>0) {
			Remainder=number1%10;
			reverse=reverse*10+Remainder;
			number1=number1/10;
			
		}
		
		//Print statement to print the reverse number
		System.out.println("ReverseNumber is "+reverse);
	}

}




/*
 	OUTPUT
Enter a number
321
ReverseNumber is 123

OR

Enter a number
52145
ReverseNumber is 54125

*/