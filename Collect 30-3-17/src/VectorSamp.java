import java.util.Enumeration;
import java.util.Vector;



//enumeration works onlu on vector and stack
public class VectorSamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();//insertion order is maintained ....stack is a subclass of vector
		
		v.add(2);
		v.add(4.9);
		v.add("sss");
		v.add(true);
		v.add(2);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){//true(if values r there) or false
			System.out.println(e.nextElement()+" ");
		}

	}

}
