import java.util.Map;
import java.util.TreeMap;

public class MapCls {

	public void show()
	{
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(10, "one");
		map.put(20, "two");
		map.put(22, "three");
		map.put(24, "three");
		map.put(24, "four");
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map);
	}
	public static void main(String[] args) {
		
MapCls m1=new MapCls();
m1.show();
	}

}
