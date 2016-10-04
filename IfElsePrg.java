//prg to show working of simple if
class IfElsePrg
 {
         int x=5;
         public void show()
         {
           if(x>10)
           {
             System.out.println("greater than 10");
           }
	   else
           {
             System.out.println("Don't enter lesser than 10 ");
           }
          }
      public static void main(String a[])
        {
          IfElsePrg p1=new IfElsePrg();
          p1.show();
        }
} 