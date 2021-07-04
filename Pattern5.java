import java.util.*;
class Pattern5
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter n value : ");
n=sc.nextInt();
int size=n*2-1;
char ch= 'A';
char[][]a=new char[size][size];
int start,end,i,j;
start=0;
end=size-1;
while(n!=0)
{
for(i=start;i<=end;i++)
{
for(j=start;j<=end;j++)
{
if(i==start||i==end||j==start||j==end)
a[i][j]=ch;
}
}
ch++;
n--;
start++;
end--;
}
for(i=0;i<size;i++)
{
for(j=0;j<size;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println( );
}
}
}