package t1;


// notify------------wakes up sleep thread
//-------------------wakes up long waiting thread
/*public class ExampleThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/    class ExampleThread1 extends Thread{  
    public void run(){  
       for(int i=1;i<5;i++){
    	   try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   System.out.println(i);
       }
       }  
       public static void main(String args[]){  
        ExampleThread1 t1=new ExampleThread1();  
        ExampleThread1 t2=new ExampleThread1();  
        ExampleThread1 t3=t2;//"main" java.lang.IllegalThreadStateException
         
        t1.start();  
        t2.start();  
        t3.start();
       }  
      }  
