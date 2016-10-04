import java.util.*;
class RelationOperator
{
 int x,y;
 boolean z;
 public void relationDetails()
 {
  System.out.println("enter x value");
  Scanner sc=new Scanner(System.in);
  x=sc.nextInt();
  System.out.println("enter y value");
  y=sc.nextInt();
  z=x<y;
  System.out.println("x<y value is "+z);
  z=x>y;
  System.out.println("x>y value is "+z);
  z=x<=y;
  System.out.println("x<=y value is "+z);
  z=x>=y;
  System.out.println("x>=y value is "+z);
  z=x==y;
  System.out.println("x==y value is "+z);
 }
 public static void main(String a[])
 {
  RelationOperator rop=new RelationOperator();
  rop.relationDetails();
 }
}