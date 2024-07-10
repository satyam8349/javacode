class Revers{
public static void main(String args[]){

int n= 234;
int sum=0;
int p=1;

while(n!=0){
int r=n%10;    // 
sum=sum+r;
p=p*r;
n=n/10;
}
}
}