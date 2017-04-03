package p1;

public class SampleArray {

	public static void show(){
		
	/*int a[]=new int[6];
	int n=5;
	int j=n;
	
	for(int i=0;i<a.length;i++){
		
		System.out.System.out.print("values r...."+a[i]);
		
	}
	n=n+1;
	a[j+1]=3;
	while(j>=3){
		a[j+1]=a[j];
		j=j-1;
		
		System.out.System.out.println("a[j+1]..."+a[j+1]);*/


   int LA[] = {1,3,5,7,8};
   int item = 10, k = 3, n = 5;
   int i = 0, j = n;
   
   System.out.print("The original array elements are :\n");
	
   for(i = 0; i<n; i++) {
      System.out.print("LA[%d] =  "+ i+ LA[i]);
   }
    
   n = n + 1;
	
   while( j >= k) {
      LA[j+1] = LA[j];
      j = j - 1;
   }
	
   LA[k] = item;
   
	System.out.print("The array elements after insertion :\n");
	
   for(i = 0; i<n; i++) {
      System.out.println("LA[%d]  \n"+ i+ LA[i]);
   }
}
		

	

	public static void main(String[] args) {
		
		show();

	}

}
