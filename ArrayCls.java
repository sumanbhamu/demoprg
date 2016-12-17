import java.util.Scanner;

public class ArrayCls {

	int arr1[];
	int i;
	public void show()
	{
		arr1=new int[5];
		System.out.println("entering the values into array");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
						
		}
		System.out.println("displaying the values from array position by position");
		for(i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+"  ");
			
		}
		for(int x:arr1)
		{
		System.out.println("the entire  array is"+ x);
		}
	}
	public static void main(String[] args) {
		
                ArrayCls a1=new ArrayCls();
                a1.show();
	}

}
