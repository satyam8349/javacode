class Parameter{
  int x,y;
  Parameter(int a,int b){
  x=a;
  y=b;
}
void show(){
System.out.println(x+ " " +y);
}
}

class B{
public static void main(String args[]){
 Parameter jj=new Parameter(100,200);
 jj.show();
}
}
