import java.util.Scanner;

class ArrayString{
public static void main(String args[]){
Scanner sa=new Scanner(System.in);
int i;
String arr[]=new String[5];

for(i=0;i<arr.length;i++){
System.out.println("enter the element of index "+i+" : ");
arr[i]=sa.nextLine();
}//  input


System.out.println("element of the array  : ");
for(i=0;i<arr.length;i++){
System.out.println(arr[i]);
}//output
}
}



 
