package Pack1;

public class RecurrsionFact {

	public int fact(int n){
		
		int f=1;
		
		/*
			for(int i=n;i>0;i--){
				f=f*i;
			}
		}*/
		
		if(n == 1) {
		      return 1;
		   }
		else
		   return n * fact(n - 1);
				
	}
	
	
	public static void main(String[] args) {
		
		RecurrsionFact r1=new RecurrsionFact();
		System.out.println(r1.fact(5));
	
	}

}

