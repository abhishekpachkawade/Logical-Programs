
/*
 Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28
*/


import java.util.Scanner;

public class PerfectNumber {
	
	 //method public type and PerfectNo is name of method
	 public void PerfectNo(int number){
	        //instance variable 
	        int sum = 0;
	        //print statement 
	        System.out.println("Factors of "+number+" are:");
	        
	        //for loop to calculate the Remainder
	        for(int i=1;i<number;i++){
	        	//calculate the Remainder with integer number
	            int Remainder = number%i;
	            if( Remainder==0){
	                System.out.print("  "+i+" ");
	                sum = sum + i;
	            }
	        } 
	        
	        System.out.println("\n Sum of Factors is ="+sum);

	        //check the number is perfect or not 
	        if(sum==number){
	                System.out.println("Perfect Number");
	            }
	        else System.out.println("not a Perfect Number");

	    }
	 
	//main method of PerfectNumber class 
	public static void main(String[] args) {
		//scanner class import 
		 Scanner scan = new Scanner(System.in);
		 
		 //ask to user enter number 
		 System.out.println("Enter a Number");
		 //store the value in number with integer  
		 int number = scan.nextInt();
		 //Object of PerfectNumber Class 
		 PerfectNumber perfectNumber = new PerfectNumber();
		 //calling the method PerfectNo passing user input value 
		 perfectNumber.PerfectNo(number);		

	}

}





/*
OUTPUT
Enter a Number
10
Factors of 10 are:
  1   2   5 
 Sum of Factors is =8
not a Perfect Number
*/

