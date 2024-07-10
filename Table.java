// wap to print table of even number

import java.util.Scanner;
class Table{
int n;
public static void main(String args[]){
Scanner sk = new Scanner(System.in);
System.out.println("enter any number");
n =sk.nextInt();

for(int i=1;i<=10;i++){
System.out.println(n*i);
}
}
}