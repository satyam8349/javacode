class D{
int a;
String city;
D(){
a=10;
city="Bhopal";
System.out.println(a+ " " +city);
}

D(D ref){
a=ref.a;
city=ref.city;
System.out.println(a+ " " +city);
}
}
class Copycons{
public static void main(String args[]){
D gg=new D();
D gg1=new D(gg);
}
}
