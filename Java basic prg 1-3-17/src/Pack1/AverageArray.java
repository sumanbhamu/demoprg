package Pack1;

//Calculate middle value of Array elements using Java Example
public class AverageArray {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,8};
		
		int x=a.length;
		
		if(x%2==0){
			System.out.println(a[(x-1)/2] +"   "+a[x/2]   );
		}
		else{
			System.out.println(a[x/2]);
		}
		
		
	}

}
