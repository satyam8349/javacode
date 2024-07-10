class Indexof{
public static void main(String args[]){
String str="welcome";

int x=str.indexOf("e");// 1
System.out.println(x);

int y= str.indexOf("e",2);
System.out.println(y);

int z=str.indexOf("me");//5
System.out.println(z);

int k=str.indexOf("Mee");//-1
System.out.println(k);
}
}


