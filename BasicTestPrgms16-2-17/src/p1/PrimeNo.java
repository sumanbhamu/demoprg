package p1;

public class PrimeNo {

	public void show(){
		
		for(int i=1;i<=100;i++){
			int c=0;
			for(int j=1;j<=i;j++){
				
				if((i%j)==0){
					c++;
				}
				
				
			}
			if(c==2){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		PrimeNo p1=new PrimeNo();
		p1.show();

	}

}
