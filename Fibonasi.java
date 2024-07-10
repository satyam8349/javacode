import java.util.Scanner;
 class Fibonasi{
   public static void main(String args[]){
   Scanner sk=new Scanner(System.in);
     
     int a=0,b=1,c,n;
   
   System.out.println("enter number: ");
   n=sk.nextInt();

   for(int i=1;i<=n;i++){
     System.out.println(+a);
           c=a+b;
           a=b;
           b=c;
}
}
} 