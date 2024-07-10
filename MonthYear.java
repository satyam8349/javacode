// Q.2 Write a Java program to convert a given integer (in days) to years, months and days,assumes
//that all months have 30 days and all years have 365 days.

//Test Data : Input no. of days: 2535
//Expected Output:
//6 Year(s)
//11 Month(s)
//15 Day(s)

import java.util.Scanner;

class MonthYear{
public static void main(String args[]){

Scanner uk=new Scanner(System.in);
System.out.println("inter the input number: ");

int input,rem,st;
input=uk.nextInt();
st=input/365;
System.out.println(" in year: "+st);
rem=2535%365;
st=rem/30;
System.out.println("in month: "+st);
rem=rem/30;
st=rem/1;
System.out.println("in days:  "+st);



}
}

