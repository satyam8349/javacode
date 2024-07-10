import java.util.Scanner;

class Lastd{
public static void main(String args[]){
Scanner sa=new Scanner(System.in);

int num,lastdigit;
System.out.println("enter number");
num=sa.nextint();

lastdigit=sa.lastdigitOf(num);
System.out.println(lastdigit);
}
}




