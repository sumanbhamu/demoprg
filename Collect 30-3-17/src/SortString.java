
public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"suman","pinku","sumi","lol","ma","pa"};
		
		String temp;
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].compareTo(str[j])>0){
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
				
			}
			System.out.println(str[i]);
		}

	}

}
