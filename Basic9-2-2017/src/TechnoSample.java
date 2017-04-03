public class TechnoSample {
    public static void main(String argv[]) {
        TechnoSample inc = new TechnoSample();
        int i =0; 
        inc.fermin(i);
        i = i++;
        System.out.println(i);
    }

    void fermin(int i) {
        i++;
    }
}


















/*package p1;
class Exampl11
{
	
	public void show(int x){
		
		System.out.println("xxxxxxxxxxxx..");
	}
}
public class Exam111 extends Exampl11{
	public void show(int x){
		System.out.println("xxxxxxxxxxxx22222..");
	}
	public void show(String x){
		System.out.println("xxxxxxxxxxxx3333..");
	}
	
	public static void main(String a[]){
		
		Exampl11 q1=new Exampl11();
		Exam111 s1=new Exam111();
		q1.show(3);
		s1.show(3);
	}
}

*/



/*package p1;

//to display no. of obj created for tht class


public class Samplie {

	
	static int i=0;
	
	Samplie()
	{
		i++;		
	}
	public void show(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Samplie s=new Samplie();
		Samplie s1=new Samplie();
		Samplie s2=new Samplie();
		Samplie s3=new Samplie();
		
		s2.show();
		
		Samplie s4=new Samplie();
		

	}

}
*/