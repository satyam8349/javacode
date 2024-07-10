import java.util.Scanner;

class Nastedif{
public static void main(String args[]){

Scanner sf=new Scanner(System.in);
char c;

System.out.println("enter any charactar");

c=sf.next().charAt(0);

if(c>='a'){// condication1
  if(c<='z'){//condication1_1
    System.out.println("lower case");

}
}

if(c>='A'){// condication1
  if(c<='Z'){//condication1_1
    System.out.println("upper case");

}
}

 }

}
