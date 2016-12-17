import java.util.Scanner;

public class AdditionArr {

	int arr1[][],arr2[][],add[][];
	int i,j;
	public void show()
	{
		arr1=new int[2][2];
		arr2=new int[2][2];
		add=new int[2][2];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1st array element");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter 2nd array element");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("adding array element");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				add[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(add[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		

		AdditionArr a1=new AdditionArr();
		a1.show();
	}

}
