import java.util.Scanner;
class Function2{

public static void evenodd(){
Scanner sk=new Scanner(System.in);
System.out.println("enter any number ");
int n=sk.nextInt();

if(n%2==0){
System.out.println("this is even number: ");
}
else{
System.out.println("this is odd number: ");
}

}

public static void main(String args[]){

evenodd();


}
}