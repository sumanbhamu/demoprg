
public class ConvertCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Suman Bhamu";
		char ch=' ';
		for(int i=0;i<a.length();i++){
			ch=a.charAt(i);
			if(Character.isUpperCase(ch)){
				System.out.print(Character.toLowerCase(ch));
			}
			else{
				System.out.print(Character.toUpperCase(ch));
			}
			
		}

	}

}
