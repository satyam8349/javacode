// Q.1  Write a Java program to convert a given integer (in seconds) to hours, minutes andseconds.
//Test Data :
//Input seconds: 25300Expected
//Output:
//There are:
//H:M:S - 7:1:40





import java.util.Scanner;

class Homework{
public static void main(String args[]){
Scanner pk= new Scanner(System.in);
System.out.println("enter input number:  ");

int a,rem,c;
a=pk.nextInt();
c=a/3600;
System.out.println("in hours:  "+c);
rem=25300%3600;
c=rem/60;
System.out.println("in minuts: "+c);
rem=rem%60;
c=rem/1;
System.out.println("in seacond: "+c);


}
}

