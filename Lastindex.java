class Lastindex{
public static void main(String args[]){
String str="welcome";

int x=str.lastIndexOf("e");
System.out.println(x);

int y= str.lastIndexOf("e",2);
System.out.println(y);

int z=str.lastIndexOf("me");
System.out.println(z);

int k=str.lastIndexOf("Mee");//-1
System.out.println(k);
}
}