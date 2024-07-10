import java.util.Scanner;

class Elseif3{
public static void main(String args[]){
char ch;
Scanner sd=new Scanner(System.in);
System.out.println("enter any number");

ch=sd.next().charAt(0);

if(ch>='a' && ch<='z'){
System.out.println("this is loar case");
}
else if(ch>='A' &&  ch<='Z'){
System.out.println("this is upper case");
}

else if(ch>='0'){
System.out.println("this is integer");
}
else{
System.out.println("this is nothing");
}
}
}


