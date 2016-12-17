import java.util.ArrayList;
import java.util.Iterator;

public class ListCls {

	public void show()
	{
		System.out.println("shows duplication");
		
		ArrayList<String> list=new ArrayList<String>();

		list.add("one");
		
		list.add("one");
		list.add("two");
		list.add("four");
		list.add(2,"three");
		list.add("five");
		/*for(String str:list)
		{
			System.out.println(str);
		}*/
		System.out.println("========instead of for loop use iteratoe======");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========");
		list.remove(2);
		for(String str:list)
		{
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		
ListCls l1=new ListCls();
l1.show();
	}

}
