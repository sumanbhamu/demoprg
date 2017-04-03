
public class SortNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,1,3,5,4};
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-i;j++){
				 if(a[j-1] > a[j]){  
                     //swap elements  
                     temp = a[j-1];  
                     a[j-1] = a[j];  
                     a[j] = temp;  
             }  
				 
			}
			System.out.println(a[i]);
		}

	}

}
