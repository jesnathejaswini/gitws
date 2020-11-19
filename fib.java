import java.io.*;
import java.util.*;
class Fib
{
void aa()
{
int a,b,c,limit,i;
Scanner sc=new Scanner(System.in);
System.out.println("limit");
limit=sc.nextInt();
a=0;
b=1;
c=0;
for(i=0;i<=limit;i++)
{
System.out.println(" "+c);
a=b;
b=c;
c=a+b;
}
}}
class Fiba
{
public static void main(String args[])
{
Fib f=new Fib();
f.aa();
}}
