
/*
Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
*/


import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		//object of StopWatch class
		StopWatch sw=new StopWatch();
		
		//ask to user start watch time 
		System.out.println("Press '1' to Start Time: ");
		Scanner scan = new Scanner(System.in);
		//store the value in abc in type of integer
		int abc = scan.nextInt();
		
		//calling the start method using object of stopWatch class 
		sw.start();

		//print statement to print space 
		System.out.println();
		//ask to user to stop the stopWatch
		System.out.println("Press '2' to Stop Time: ");
		//store the value in abc in type of integer
		int abc1 = scan.nextInt();
		
		//calling the stop method using object of stopWatch class 
		sw.stop();

		//calling the ElapsedTime method and store the value in l type of is longe 
		long l=sw.getElapsedTime();
		//printing the space
		System.out.println();
		//printing ElapsedTime in millisec 
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		//printing the ElapsedTime time in millisec to seconds
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");

	}

	//constant variable 
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	//to start timer
	public void start()
	{
		//take a current time and store in startTime variable 
		startTimer=System.currentTimeMillis();
		//printing start time 
		System.out.println("Start Time is: "+startTimer);
	}
	
	// to stop timer
	public void stop()
	{
		//take a current time and store in stoptTime variable 
		stopTimer=System.currentTimeMillis();
		//printing stop time 
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	//this method calculate ElapsedTime
	public long getElapsedTime()
	{
		//calculate the ElapsedTime 
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
}





/*
OUTPUT

Press '1' to Start Time: 
1
Start Time is: 1630131761912

Press '2' to Stop Time: 
2
Stop Time is: 1630131765469

Total Time Elapsed(in millisec) is:3557

Converting millisec to seconds: 3 sec


*/