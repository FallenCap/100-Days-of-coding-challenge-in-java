/*Write  a  multithreading  program  by  using  runnable interface  in which  run ()  method 
should perform the following task:
Display a time stamp
Display greeting message for 10 times (Such as hi, hello, good morning)
Wait for 1000 milliseconds
*/

package Day037;

import java.lang.Thread;
import java.sql.Timestamp;
import java.time.Instant;

class showTimeStamp extends Thread {
	//Creating a class which extends thread class.
	public void run() {
		//defining run method for printing the time stamp.
		try {
			 Timestamp instant= Timestamp.from(Instant.now()); 
			 System.out.println("Time: " + instant);
		}
		catch(Exception e) {
			System.out.println("Invalid Request!");
		}
	}
}

class greetingMessage extends Thread {
	//Creating class to display greeting which extends thread class.
	public void run() {
		//defining run method for printing the greetings.
		try {
			for(int i = 1; i <= 10; i++) {
				System.out.println("Hello everyone.");
				sleep(1000); //adding 1 sec delay in this thread.
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Request!");
		}
	}
}


public class MultiThreading1 {

	public static void main(String[] args) {
		showTimeStamp time = new showTimeStamp(); //Creating object for showTimeStamp class.
		greetingMessage greet = new greetingMessage();//Creating object for greetingMessage class.
		time.start();
		try {
			time.join();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		greet.start();
	}

}




//-------------Test Case-------------

//Output: 
//Time: 2022-11-17 22:07:16.2226976
//Hello everyone.
//Hello everyone.
//Hello everyone.
//Hello everyone.
//Hello everyone.
//Hello everyone.
//Hello everyone.
//Hello everyone.
//Hello everyone.
//Hello everyone.
