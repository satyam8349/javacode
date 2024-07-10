class Overloding{
public void add(){
int a,b,c;
a=10;
b=20;
c=a+b;
System.out.println("addication without argument: " +c);
}

public int add(int a,int b){
int c;
a=10;
b=20;
c=a+b;
System.out.println("addication without two int argument: " +c);
return c;
}

public void add(float a,float b){
float c=a+b;
System.out.println("add with float number: "+c);
}

public static void main(String args[]){
Overloding obj=new Overloding();
obj.add();
obj.add(5,7);
obj.add(2.5f,4.5f);
}
}

