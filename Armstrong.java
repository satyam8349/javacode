import java.util.Scanner;

class Armstrong{
public static void main(String args[]){
int n,rem,arm=0,c;
Scanner r = new Scanner(System.in);
 

System.out.println("enter number");
n=r.nextInt();

c=n;
while(n>0){
rem=n%10;
arm=(rem*rem*rem)+arm;
n=n/10;
}
if(c==arm){
System.out.println("Armstrong number");

}
else{
System.out.println("not a Armstrong number");
}
}
}



