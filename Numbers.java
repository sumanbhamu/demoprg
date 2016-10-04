import java.util.*;
class Numbers
{
 int x,y;
 float f;
 double d;
 String st;
 char ch;
 boolean b;
 public void noDisplay()
 {
  System.out.println("enter first no.");
  Scanner sc=new Scanner(System.in);
  x=sc.nextInt();
  System.out.println("enter 2nd no.");
  y=sc.nextInt();
  System.out.println("boolean value is "+b);
  b=x<y;
  System.out.println("enter no. with decimals");
  f=sc.nextFloat();
  System.out.println("enter double no.");
  d=sc.nextDouble();
  System.out.println("enter any name");
  st=sc.next();
  System.out.println("enter a character");
  ch=sc.next().charAt(3); 
  x=x+y;
  System.out.println("integer value is "+x);System.out.println(b);
  
  System.out.println("float value is "+f);
  System.out.println("double value is "+d);
  System.out.println("string value is "+st);
  System.out.println("char value is "+ch);
  }
 public static void main(String a[])
 {
  Numbers no=new Numbers();
  no.noDisplay();
 }
}
  
  
  
  
  
  
  