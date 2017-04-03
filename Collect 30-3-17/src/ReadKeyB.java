import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


//wap to read 10 integer values from keyboard and print max and min no using collection
public class ReadKeyB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li =new ArrayList<Integer>();
		
		System.out.println("enter the 10 no...");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			li.add(sc.nextInt());
			
		}
		System.out.print(li);
		int small=li.get(0);// 1st get 1st element
		int lar=li.get(0); //1st element
		
		for(int su:li){
			if(su<small){
				small=su;
			}
			else if(su>lar){
				lar=su;
			}
		}
		System.out.println("small...."+small);
		System.out.println("lar......."+lar);
		
		
		//System.out.println(li.get(0));
		
		/*System.out.println(li.indexOf(li));
		System.out.println(li.lastIndexOf(li));*/
		/*HashSet hs=new HashSet();
hs.*/
	}

}
