package p1;

//ex on instanceOf operator
class A{
	
}
public class InstaceOff extends A {

	public static void main(String[] args) {
		A a=new A();
		InstaceOff i=new InstaceOff();
		A a1=new InstaceOff();
		
		System.out.println(a instanceof A);
		System.out.println(i instanceof A);
		System.out.println(a1 instanceof A);
		
		System.out.println(a1 instanceof InstaceOff );
		System.out.println(i instanceof InstaceOff);
		System.out.println(a instanceof InstaceOff);
		

	}

}
