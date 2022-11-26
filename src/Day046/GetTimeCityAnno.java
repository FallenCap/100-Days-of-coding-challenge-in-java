/*Create a java interface to get time of any time zone given by user and override the interface using anonymous class.*/
package Day046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.TimeZone;

interface GetCurrentTime {
	//Creating the interface to get timezone
	
	 void getTime(String timeZone); //Method for get timezone.
}

public class GetTimeCityAnno {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException  {
		
		//Taking input from user as a timeZone.
		System.out.print("Enter the name of the time-zone: ");
		String timeZone = br.readLine();
		
		GetCurrentTime city = new GetCurrentTime() {
			//Creating a anonymous class.
			
			@Override
			public void getTime(String timeZone) {
				//Overrriding the getTime method.
				
				Calendar calCity = Calendar.getInstance(); //creating a instance of calender class.
			     calCity.setTimeZone(TimeZone.getTimeZone(timeZone)); //setting time zone of the given city.
			     
			     //Printing the time of that city.
				    System.out.println(); 
			      System.out.println("Time in " + timeZone + " is: " + calCity.get(Calendar.HOUR_OF_DAY) + ":"
			        + calCity.get(Calendar.MINUTE)+":"+calCity.get(Calendar.SECOND));
					   System.out.println();
			}
		};
		city.getTime(timeZone);
	}

}



//-------------Test Case-------------

//TestCase1: America/New_York
//Output:
//Time in America/New_York is: 9:59:21

//TestCase 2: India/Hyderabad
//Output: 
//Time in India/Hyderabad is: 14:59:54
