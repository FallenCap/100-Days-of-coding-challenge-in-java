/*Write a program to calculate overtime pay of a number employees which is inputed by user. Overtime is paid at the rate of
Rs. 12.00 per hour for every hour worked above 40 hours. Assume that employees do not
work for fractional part of an hour.*/

package Day014;

import java.util.*;
public class OvertimePay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Giving the input for the numbers of workers you want
		System.out.print("Enter the number of workers you want: ");
		int workers = sc.nextInt();
		
		//Giving the input in the name array
		String name[] = new String[workers];
		for(int i = 0; i < name.length; i++) {
			System.out.print("Enter the name of the person "+ (i + 1) + ":");
			name[i] =  sc.next();
		}
		System.out.println("\n");
		
		//Giving the input in the workTime array
		int workTime[] = new int[workers];
		for(int j = 0; j < workTime.length; j++) {
			System.out.print(name[j] + "'s total work time in this week in hours is:");
			workTime[j] = sc.nextInt();
		}
		System.out.println("\n");
		sc.close();
		OverTimePay(name, workTime);
	}
	
	//Function for overtime payment
	public static void OverTimePay(String name1[], int workTime1[]) {
		for(int i = 0; i < workTime1.length; i++) {
			if(workTime1[i] > 40) {
				int overTime = workTime1[i] - 40;
				System.out.println(name1[i] + "'s total overtime in hours is:" + overTime);
				System.out.println(name1[i] + "'s Total over time payment: " + (overTime * 12));
			}
			else {
				System.out.println(name1[i] + "'s total work time is less then 40 hours so he dosen't get any over time payment.");
			}
			System.out.println("\n");
		}
	}

}



//------------ Test Cases -----------
//TestCase1:
//Enter the number of workers you want: 5
//Enter the name of the person 1:Subham
//Enter the name of the person 2:Soumyadeep
//Enter the name of the person 3:Sarvesh
//Enter the name of the person 4:Atin
//Enter the name of the person 5:Surya
//
//
//Subham's total work time in this week in hours is:23
//Soumyadeep's total work time in this week in hours is:56
//Sarvesh's total work time in this week in hours is:21
//Atin's total work time in this week in hours is:63
//Surya's total work time in this week in hours is:47
//
//
//Subham's total work time is less then 40 hours so he dosen't get any over time payment.
//
//
//Soumyadeep's total overtime in hours is:16
//Soumyadeep's Total over time payment: 192
//
//
//Sarvesh's total work time is less then 40 hours so he dosen't get any over time payment.
//
//
//Atin's total overtime in hours is:23
//Atin's Total over time payment: 276
//
//
//Surya's total overtime in hours is:7
//Surya's Total over time payment: 84


//TestCase2:
//Enter the number of workers you want: 8
//Enter the name of the person 1:Subham
//Enter the name of the person 2:Soumyadeep
//Enter the name of the person 3:Niloy
//Enter the name of the person 4:Atin
//Enter the name of the person 5:Sarvesh
//Enter the name of the person 6:Pavan
//Enter the name of the person 7:Surya
//Enter the name of the person 8:Raj
//
//
//Subham's total work time in this week in hours is:32
//Soumyadeep's total work time in this week in hours is:45
//Niloy's total work time in this week in hours is:21
//Atin's total work time in this week in hours is:67
//Sarvesh's total work time in this week in hours is:43
//Pavan's total work time in this week in hours is:34
//Surya's total work time in this week in hours is:87
//Raj's total work time in this week in hours is:65
//
//
//Subham's total work time is less then 40 hours so he dosen't get any over time payment.
//
//
//Soumyadeep's total overtime in hours is:5
//Soumyadeep's Total over time payment: 60
//
//
//Niloy's total work time is less then 40 hours so he dosen't get any over time payment.
//
//
//Atin's total overtime in hours is:27
//Atin's Total over time payment: 324
//
//
//Sarvesh's total overtime in hours is:3
//Sarvesh's Total over time payment: 36
//
//
//Pavan's total work time is less then 40 hours so he dosen't get any over time payment.
//
//
//Surya's total overtime in hours is:47
//Surya's Total over time payment: 564
//
//
//Raj's total overtime in hours is:25
//Raj's Total over time payment: 300
