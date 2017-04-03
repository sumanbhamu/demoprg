package p1;

//method overloading ---static binding
public class StaticBinding {

	public void show(){
		System.out.println("this is 1st mthd");
	}
	public void show(int x){
		System.out.println("this is 2nd mthd "+x);
	}
	public void show(String a){
		System.out.println("this is 3rd mthd "+a);
	}
	public static void main(String[] args) {
		StaticBinding s1=new StaticBinding();
		s1.show();
		s1.show(1);
		s1.show("ssss");

	}

}
