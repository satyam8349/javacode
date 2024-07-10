class Arrsum{
public static void main(String args[]){
int arr[]=new int[5];
int i,sum=0;
Scanner sk = new Scanner(System.in);
for(i=0;i<arr.length;i++){
System.out.println("element endex of  "+i+" : ");
arr[i]=sk.nextInt();
sum=sum+arr[i];
}
System.out.println(+sum);
System.out.println("average:" +sum/arr.length);
}
}
