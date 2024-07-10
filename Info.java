import java.util.Scanner;

class Info{
public static void main(String args[]){
Scanner sk = new Scanner(System.in);


System.out.println("enter name: ");
String name = sk.nextLine();

System.out.println("enter section: ");
char sec= sk.next().charAt(0);

System.out.println("enter address: ");
String add= sk.next();



System.out.println("name: " +name);
System.out.println("section: "+sec);
System.out.println("address: " +add);
}
}
