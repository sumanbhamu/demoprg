package Pack1;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int s[]={1,2,0,3,5,6};
		int n=s.length;
		
		int small = s[0];
		int large = s[0];
		
		
			for(int j=0;j<n;j++){
			if(s[j]>large){
				large=s[j];
			}
			else if(s[j]<small)
			{
				small=s[j];
			}
			
		}
			System.out.println("largest..."+large);
			System.out.println("small.."+small);
	}

}
