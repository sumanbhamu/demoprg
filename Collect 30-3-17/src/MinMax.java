
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={9,7,0,6,5,40};
		
		int small=a[0];
		int large=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>large){
				large=a[i];
			}
			else if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("small.."+small);
		System.out.println("large.."+large);

	}

}
