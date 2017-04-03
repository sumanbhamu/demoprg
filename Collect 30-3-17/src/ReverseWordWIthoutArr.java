
public class ReverseWordWIthoutArr {

	public static void main(String[] args) {
		String str="hello suman hw r yu";
		String te="";
		String revW="";
		for(int i=str.length()-1;i>=0;i--){
			te=te+str.charAt(i);//reverse str
			if(str.charAt(i)==' '||i==0){
				for(int j=te.length()-1;j>=0;j--){
					revW=revW+te.charAt(j);
				}te="";
			}
			
		}System.out.println(revW+" ");
		
		
	}
	}