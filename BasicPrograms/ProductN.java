import java.util.Scanner;

public class ProductN {
	// product of n no...
	/*4.
	You have
	been given
	an array
	A of
	size N
	consisting of
	positive integers.
	You need
	to find
	and print
	the product
	of all
	the number in this array.*/

	public void show() {
		int a[] = new int[5];
		System.out.println("enter the no......");
		Scanner sc = new Scanner(System.in);
		int temp = 1;
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			temp *= a[i];

		}
		System.out.println(temp);

	}

	public static void main(String[] args) {
		ProductN p1 = new ProductN();
		p1.show();

	}

}
