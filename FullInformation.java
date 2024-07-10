import java.util.Scanner;

class FullInformation{
public static void main(String args[]){
Scanner ss = new Scanner(System.in);


System.out.println("enter name: ");
String name = ss.nextLine();


System.out.println("enter salary: ");
int salary = ss.nextInt();


System.out.println("enter profile: ");
String profile = ss.nextLine();



System.out.println("enter empNo: ");
int empNo = ss.nextInt();

System.out.println("enter grade: ");
char grade =  ss.next().charAt(0);


System.out.println("name: " +name);
System.out.println("salary: " +salary);
System.out.println("profile: " +profile);
System.out.println("empNo: " +empNo);
System.out.println("grade: " +grade);
}
}


