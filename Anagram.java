package Assignments;
import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {

		String s = "abcdeadeiflna";

		String s1 = "dcandflenckeab";

		if (s.length() == s1.length()) {
			char[] c = s.toCharArray();
			char[] d = s1.toCharArray();

			Arrays.sort(c);
			Arrays.sort(d);
			System.out.println(s);
			System.out.println(d);

			if (Arrays.equals(c, d)) {
				System.out.println("Anagram word is the given word");
			}
		
		}
		else
		{
			System.out.println("Not a anagram word");
		}

	}

}
