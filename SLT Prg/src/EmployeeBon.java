import java.util.Scanner;

public class EmployeeBon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String eName;
		int esal;
		int i=0;
		int a=0,b=0,c=0;
		
		System.out.println("enter 10 employee values");
		Scanner sc=new Scanner(System.in);
		while(i<10){
			
			eName=sc.next();
			esal=sc.nextInt();
			
			if(esal==10000){
				esal=esal*(30/100);
				a++;
			}
			else if(esal==50000){
				esal=esal*(20/100);
				b++;
			}
			else if(esal==100000){
				esal=esal*(10/100);
				c++;
				
			}
			
			i++;
		}
		System.out.println("total bonus::.."+((a*3000)+(b*10000)+(c*10000)));
		

	}

}
