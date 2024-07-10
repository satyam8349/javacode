import java.util.Scanner;

class Functionreturn{
public static int add(){
Scanner sk = new Scanner(System.in);
System.out.println("enter first number: ");
int a=sk.nextInt();

System.out.println("enter seacond number: ");
int b=sk.nextInt();

int c=a+b;
return c;
}
public static void main(String args[]){
int result=add();
System.out.println("addication: " +result);
}
}

