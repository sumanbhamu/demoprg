


//wap to read integer values frm keybord and print sum of 5 values using collection: ex...3,7,5,2,1    op:18
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> li=new ArrayList<>();
		System.out.println("enter 5 values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			li.add(sc.nextInt());
		}
		System.out.println(li);
		
		int sum=0;
		for(int x:li)
		{
		sum=sum+x;	
		}
		System.out.println("sum..."+sum);

	}

}
