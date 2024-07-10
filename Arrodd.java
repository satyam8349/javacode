class Arrodd{
public static void main(String args[]){
int arr[5]=new int[5];
int I,sum=0;
Scanner sk = new Scanner(System.in);
for(i=0;i<arr.length;i++){
System.out.println("element endex of " "+i+" : ");
arr[i]=sk=.nextInt();
if(arr[i]%2!=0){
sum=sum+arr[i];
}
}
System.out.println(+sum);

}
}
