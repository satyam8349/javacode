import java.util.Scanner;

class Function3{
public static int add(int a,int b){
return a+b;
}
public static void main(String args[]){

Scanner sk = new Scanner(System.in);
System.out.println("enter first number: ");
int x=sk.nextInt();

System.out.println("enter seacond number: ");
int y=sk.nextInt();

int result=add(x,y);
System.out.println("addication:" +result);
}
}
