package p1;
public class MissingNumberInArray
{
    //Method to calculate sum of 'n' numbers

    static int sumOfNnumbers(int n)
    {
        int sum = (n * (n+1))/ 2;

        return sum;
    }

    //Method to calculate sum of all elements of array

    static int sumOfElements(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int n = 8;

        int[] a = {1, 4, 5, 3, 7, 8, 6};

        //Step 1

        int sumOfNnumbers = sumOfNnumbers(n);

        //Step 2

        int sumOfElements = sumOfElements(a);

        //Step 3

        int missingNumber = sumOfNnumbers - sumOfElements;

        System.out.println("Missing Number is = "+missingNumber);
    }
}















/*package p1;

public class FindMissingNoArray {

	public static void main(String[] args) {
	
		int a[]={2,1,5,4,6};
		
		int tot=0;
		
		int temp,x=0;
		//sum
		for(int i=0;i<5;i++){
			
			tot=tot+a[i];
		}
		
		System.out.println("tot...."+tot);
        for(int j=0;j<5;j++){
			
        	if(a[j]>0)
        	{
        		System.out.println(j+1);
        		System.out.println("....missin...."+(tot-(j+1)));
        	}
        	//x=j+1;
        	
        	//tot-=a[j];
			
		}
        
		
		

	}

}
*/