
public class FactorEx {

	
	public void show() {
		int n = 6, c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}

		}
		System.out.println(c + " times factors..." + n);
	}

	public static void main(String[] args) {

		FactorEx f1 = new FactorEx();
		f1.show();
	}

}
