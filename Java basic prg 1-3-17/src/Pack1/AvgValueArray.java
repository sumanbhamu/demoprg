package Pack1;

public class AvgValueArray {

	public static void main(String[] args) {
		
		int s[]={1,2,3,4,5,6};
		
		int sum=0;
		
		for(int i=0;i<s.length;i++){
			sum=sum+s[i];
		}
		System.out.println("sum..."+sum);
		
		float avg=sum/s.length;
		System.out.println("avg value....."+avg);
		

	}

}
