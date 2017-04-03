public class StringPalendrome {
/*
	You have
	been given
	a String
	S.You need
	to find
	and print whether this
	string is
	a palindrome
	or not.
	If yes, print"YES"(
	without quotes),else print"NO"(
	without quotes).*/

	public void show() {
		StringBuffer str = new StringBuffer("iommm");
		StringBuffer str6 = new StringBuffer(" ");
		char str1 = ' ';

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str.charAt(i);
			System.out.print(str1);
			str6.append(str1);
		}
		if (str.equals(str6)) {
			System.out.println("YES");
		} else {
			System.out.println("...NO..");
		}
		// System.out.println(str6);

	}

	public static void main(String[] args) {
		StringPalendrome p1 = new StringPalendrome();
		p1.show();

	}

}
