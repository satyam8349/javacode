class Highestarray{
public static void main(String args[]){
int arr[]={100,200,300,400,500};
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
}
System.out.println("largest element of arr: " +max);
}
}


