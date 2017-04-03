
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="suman is a good girl";
		String de[]=st.split(" ");
		
		for(int i=de.length-1;i>=0;i--){
			System.out.print(de[i]+" ");
		}

	}

}
