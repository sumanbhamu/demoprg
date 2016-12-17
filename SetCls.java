import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCls {

	public void show()
	{
	Set<Integer> set=new TreeSet<Integer>();
	set.add(new Integer(111));
	set.add(new Integer(444));
	set.add(new Integer(222));
	set.add(new Integer(555));
	set.add(new Integer(555));
	
	Iterator <Integer> it=set.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}
	public static void main(String[] args) {
	
SetCls s1=new SetCls();
s1.show();

	}

}
