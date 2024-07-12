class Cons{
 int a;
String name;
 Cons(){
a=0;
name=null;
}
void show(){
System.out.println(a+ " " +name);
}
}
class B{
public static void main(String args[]){
  Cons jj= new Cons();
  jj.show();
}
}