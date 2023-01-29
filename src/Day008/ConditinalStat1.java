/*Write a Java program to find the number of days in a month.*/
package Day008;
import java.util.*;

public class ConditinalStat1 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void FindDays(int month, int year) {
		//Method to find the number of days in a month.
		String MonthOfName = " ";				//Initializing the month name.
		int number_Of_DaysInMonth = 0;	//Initializing the days of a month.
		
		 switch (month) {
		 //Switch case to check the month number.
         case 1:
             MonthOfName = "January";
             number_Of_DaysInMonth = 31;
             break;
         case 2:
             MonthOfName = "February";
             if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            	 //if-else statement to check whether the user given year is leapyear or not.
                 number_Of_DaysInMonth = 29;
             } else {
                 number_Of_DaysInMonth = 28;
             }
             break;
         case 3:
             MonthOfName = "March";
             number_Of_DaysInMonth = 31;
             break;
         case 4:
             MonthOfName = "April";
             number_Of_DaysInMonth = 30;
             break;
         case 5:
             MonthOfName = "May";
             number_Of_DaysInMonth = 31;
             break;
         case 6:
             MonthOfName = "June";
             number_Of_DaysInMonth = 30;
             break;
         case 7:
             MonthOfName = "July";
             number_Of_DaysInMonth = 31;
             break;
         case 8:
             MonthOfName = "August";
             number_Of_DaysInMonth = 31;
             break;
         case 9:
             MonthOfName = "September";
             number_Of_DaysInMonth = 30;
             break;
         case 10:
             MonthOfName = "October";
             number_Of_DaysInMonth = 31;
             break;
         case 11:
             MonthOfName = "November";
             number_Of_DaysInMonth = 30;
             break;
         case 12:
             MonthOfName = "December";
             number_Of_DaysInMonth = 31;
     }
     System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
	}
	public static void main(String[] args) {
		//Taking the month number by the user.
		System.out.print("Enter the month number: ");
		int month = sc.nextInt();
		//Takign the year by the user.
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		FindDays(month, year);
	}
	

}



//------------ Test Cases ------------
//testCase1: 
//Enter the month number: 2
//Enter the year: 2016
//February 2016 has 29 days

//testCase2: 
//Enter the month number: 6
//Enter the year: 2017
//June 2017 has 30 days


