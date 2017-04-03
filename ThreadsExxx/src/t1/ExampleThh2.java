package t1;
// Problem if you direct call run() method

/*Each thread starts in a separate call stack.
Invoking the run() method from main thread, the run() method
 goes onto the current call stack rather than at the beginning of a new call stack.
*/
 
class ExampleThh2 extends Thread{  
     public void run(){  
      for(int i=1;i<5;i++){  
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
        System.out.println(i);  
      }  
     }  
     public static void main(String args[]){  
      ExampleThh2 t1=new ExampleThh2();  
      ExampleThh2 t2=new ExampleThh2();  
       
      t1.run();  
      t2.run();  
     }  
    }  