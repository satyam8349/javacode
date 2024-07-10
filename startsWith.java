//  startsWith method

class startsWith{
public static void main(String args[]){
String str="www.cybrom.com";

Boolean b=str.startsWith(".com");
System.out.println(b);//false

b= str.startsWith("www");
System.out.println(b);
}
}