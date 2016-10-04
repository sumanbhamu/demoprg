//prg to show working of if-else if-else
import java.util.*;
class ElseIfPrg
 {
         int x;
         public void show()
         {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter no.");
           x=sc.nextInt();
           if(x==0)
           {
             System.out.println("no. equal to zero "+x);
           }
           
	   else if(x>0)
	   {
	    System.out.println("+ve no. "+x);
	    }
           else
           {
             System.out.println("-ve no."+x);
           }
         }
      public static void main(String a[])
        {
          ElseIfPrg p1=new ElseIfPrg();
          p1.show();
        }
} 