// Switch statement



import java.util.Scanner;



class Switch{

public static void main(String args[]){

Scanner sf=new Scanner(System.in);
char c;

System.out.println("enter any charactar");

c=sf.next().charAt(0);

switch(c){
case 'a':
System.out.println("it is vowel");
break;

case 'e':
System.out.println("it is vowel");
break;

case 'i':
System.out.println("it is vowel");
break;

case 'o':
System.out.println("it is vowel");
break;

default:
System.out.println("it is not a vowel");
}
}
}