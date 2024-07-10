import java.util.Scanner;

class Array2{
public static void main(String args[]){
Scanner sa=new Scanner(System.in);
int i;
int arr[]=new int[5];

for(i=0;i<arr.length;i++){
System.out.println("enter the element of index "+i+" : ");
arr[i]=sa.nextInt();
}//  input


System.out.println("element of the array  : ");
for(i=0;i<arr.length;i++){
System.out.println(arr[i]);
}//output
}
}



 
