import java.util.Scanner;

public class TableN {

	
	public void show(){
		int n,x;
		System.out.println("enter the nth value..");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("enter the table no..");
		x=sc.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println(x +" * "+ i +" = "+ x*i);
		}
		
		
	}
	public static void main(String[] args) {
		
		 TableN t1=new  TableN();
		 t1.show();
	}

}
