class Constructor1{
          int a;
          String name;
      Constructor1(){
          a=0;
          name=null;
}
     void show(){
  System.out.print(a+ " " +name);
}
} 
class B{
public static void main(String args[]){

     Constructor1 obj=new Constructor1();
     obj.show();
}
}