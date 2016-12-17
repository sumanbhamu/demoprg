import java.util.Scanner;

public class MultiArrayCls {

	int arr1[][];
	int i,j;
	
	public void show()
	{
		arr1=new int[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();
				//System.out.println(arr1[i][j]+"   ");
			}
		}

		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+"   ");
			}
			System.out.println();
		}
	
	
	
	}
	public static void main(String[] args) {
		MultiArrayCls m1=new MultiArrayCls();
		m1.show();

	}

}
