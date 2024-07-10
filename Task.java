class Task{
public static void main(String args[]){
String name="welcome";
String rev="";
int lang=name.langth();
for(int i=lang-1;i>=0;i--){
rev =rev+name.charAt(i);
}
System.out.println(+rev);
}
}


