public class ExceptionTest {
   public static void main(String[] args) {
          m();
          System.out.println("Code after exception handling");
   }
   
   static void m() {
          try {
                 m();
          } catch (StackOverflowError e) {
                 e.printStackTrace();
          }
   }
}
