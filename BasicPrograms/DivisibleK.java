import java.util.Scanner;

public class DivisibleK {
	/*
	 * 5. You have been given 3 integers l, r and k. Find how many numbers
	 * between l
	 * 
	 * and r (both inclusive) are divisible by k. You do not need to print these
	 * numbers, you just have to find their count.
	 */
	public void show(){
		int l,r,k,c=0;
		System.out.println("enter 3 no.");
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		r=sc.nextInt();
		k=sc.nextInt();
		
		for(int te=l;te<=r;te++){
			if(te%k==0)
			{
				c++;
			}
			
		}
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		DivisibleK d1=new DivisibleK();
		d1.show();

	}

}
