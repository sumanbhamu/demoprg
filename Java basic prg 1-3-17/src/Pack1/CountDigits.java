package Pack1;

public class CountDigits {

	public static void main(String[] args) {

		int c=0;
		int i=-123;
		//for(int j=i%10;j%10>0;j++){
			do{//rem----last value
				c++;
				i=i/10;   //remaining values
			}while(i%10!=0);
			
	//	}
		System.out.println("count digits...."+c);
		
		/*String s1="1238";
		System.out.println(s1.length());*/

	}
	 //if else and while------------------------------
	/*if(no=0){
	 * c=1;
	 * else{
	 * while(i%10!=0){
	 * c++;
	 * i=i/10;
	 * }
	 * }
	 
		
	}*/

}
