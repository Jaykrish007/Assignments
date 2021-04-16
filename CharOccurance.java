package Assignments;

public class CharOccurance {
	public static void main(String[] args) {

		// e occurrence in the string

		String str = "Jayakrishnaa";
		int count = 0;
		char ch[] = str.toCharArray();// string changed to char array
		int length = ch.length;// get the length of the character array
		for (int i = 0; i < ch.length; i++) {

			// if (Chars.contains(ch'a')== ch[i]))
			// {
			if (ch[i] == 'a') {
				count++;
			}
		}

		System.out.println("Occurance of a is:" + count);

	}

	//System.out.println("Occurance of a is:" +count);

}
