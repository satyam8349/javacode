import java.util.Scanner;

class Vowel{
public static void main(String args[]){

Scanner sf=new Scanner(System.in);
char ch;

System.out.println("enter any charactar");

ch=sf.next().charAt(0);

if(ch=='a' ||ch== 'e' ||ch== 'i' ||ch== 'o' ||ch== 'u'){
System.out.println("vowel");
}
else{
System.out.println("not a vowel");
}
}
}





