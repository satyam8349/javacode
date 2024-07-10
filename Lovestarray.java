class Lovestarray{
public static void main(String args[]){
int arr[]={100,200,300,400,500};
int min=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]<min){
min=arr[i];
}
}
System.out.println("lovest element of arr: " +min);
}
}
