package p1;

public class Pattern1 {

	public void show(){
		int i,j;
		/*for(i=1;i<=5;i++){
			for(j=5;j>=i;j--){
				System.out.print(j + " " );
			}
			System.out.println();
			
		}
		
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(i + " " );
			}
			System.out.println();
			
		}*/for(i=5;i>=1;i--){
			
			for(j=1;j<=5-i;j++){
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++){
				System.out.print(i + " " );
			}
			System.out.println(" ");
			
		}
for(i=1;i<=5;i++){
			
			for(j=1;j<=5-i;j++){
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++){
				System.out.print(i + " " );
			}
			System.out.println(" ");
			
			
			
		}
for (int x=0;x<=5;x++) {

for (int y=0;y<i;y++) {
System.out.print("* ");
}
System.out.println();
}

}
	public static void main(String[] args) {
		Pattern1 p1=new Pattern1();
		p1.show();
	}

}
