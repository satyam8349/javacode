class Constructor1{
          int a;
          String name;
      Constructor(){
          a=0;
          name=null;
}
     void show(){
  System.out.print(a+ " " +name);
}
} 
class B{
public static void main(String args[]){

     Constructor obj=new Constructor();
     obj.show();
}
}