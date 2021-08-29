
/*
Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
*/

public class FibonacciSeries {
	//static variable
	static int n1=0,n2=1,n3=0; 
	
	 //static method with one parameter 	
	 static void printFibonacci(int count){
		//if condition to check count is less than zero or not  
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	public static void main(String[] args) {
		//local variable 
		int count=10;    
		System.out.print(n1+" "+n2);//printing 0 and 1    
		printFibonacci(count-2);//n-2 because 2 numbers are already printed   

	}

}
