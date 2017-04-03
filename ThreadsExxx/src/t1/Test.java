package t1;
public class Test extends Thread {
    public void run() {
        System.out.println(isAlive());
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.isAlive());
        test.run();
    }	
}