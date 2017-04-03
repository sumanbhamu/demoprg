package p1;

public class DynamicBinding extends A {

	public void d1(){
		System.out.println("this is d1");
	}
	
	public static void main(String[] args) {
		
		DynamicBinding ob=new DynamicBinding();
		ob.d1();
		ob.m1();
		ob.m2();

	}

}
class A{
	public void m1(){
		System.out.println("this is m1");
	}
	public void m2(){
		System.out.println("this is m2");
	}
}