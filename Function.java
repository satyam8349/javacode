import java.util.Scanner;
class Function{

public static void Add(){
Scanner sk=new Scanner(System.in);
System.out.println("enter number 1: ");
int n1=sk.nextInt();

System.out.println("enter number 2: ");
int n2=sk.nextInt();

int n3=n1+n2;
System.out.println("addication : " +n3);
}

public static void main(String args[]){

Add();


}
}