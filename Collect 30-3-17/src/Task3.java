
//wap to print all obj whose values is greater thn 50 using collection ex::{20,40,60,90,10} op:{60 and 90}
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(60);
		al.add(90);
		al.add(30);
		
		for(int x:al){
			if(x>50){
				System.out.println(x);
			}
			
		}

	}

}
