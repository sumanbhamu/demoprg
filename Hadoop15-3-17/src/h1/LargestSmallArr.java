package h1;

public class LargestSmallArr {

	public static void main(String[] args) {
	/*	int a[]={10,4,3,2,5,6};		
			int small=a[0];
			int larg=a[0];		
		for(int j=0;j<a.length;j++){
		if(a[j]>larg){
				larg=a[j];
			}
		else if(a[j]<small){
				small=a[j];
			}
	}
		System.out.println("small.."+small+"...large..."+larg);*/
		
		
		//1st sort---and then 1st vale is small and last --greatest
		
		int a[]={2,1,3,5,4,6,0};
		
		/*int b[];
		for(int x=0;x<a.length;x++){
			b[x]=a[x];
		}*/
		int temp=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=1;j<i;j++){
				  if(a[j-1] > a[j]){  
                      //swap elements  
                      temp = a[j-1];  
                      a[j-1] = a[j];  
                      a[j] = temp;  
                      System.out.println(temp);
              }  
				  
				
				
			}
		}
	}
}
