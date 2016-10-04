ismport java.util.*;
class Operators
{
 int x,y,a,s,mul,mod,div;
 public void opDisplay()
 {
 System.out.println("enter 1st value");
 Scanner sc=new Scanner(System.in);
 x=sc.nextInt();
 System.out.println("enter 2st value");
 y=sc.nextInt();
 a=x+y;
 s=x-y;
 mul=x*y;
 mod=x%y;
 div=x/y;
 System.out.println("addition value is "+ a);
 System.out.println("substraction value is "+ s);
 System.out.println("multiplication value is "+ mul);
 System.out.println("modulus value is "+ mod);
 System.out.println("division value is "+ div);
 }
 public static void main(String a[])
 {
  Operators op=new Operators();
  op.opDisplay();
  }
}

 
 