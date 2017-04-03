import java.util.*;
public class SampleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList a1=new ArrayList();
		a1.add(2);
		a1.add(3.0);
		a1.add(2);
		System.out.println(a1);*/
		Task4 t= new Task4();
		Vector a1=new Vector();
		a1.add(t);
		a1.add(2);
		a1.add(3.0);
		a1.add(2);
		System.out.println(t.name);
		System.out.println(t.a);
		System.out.println(a1);

	}

}
