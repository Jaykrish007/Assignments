package Assignments;

public class Duplicates {
	public static void main(String[] args) {

		String S = "We learn java in basics as part of java sessions in java week1.";
		int count = 0;

		String[] w = S.split("");// split is to return a array type

		for (int i = 0; i < w.length; i++) {
			System.out.print(w[i]);// each word print and split
			count++;
		}
		System.out.println();

		if (count > 1) {
			String replace = S.replace("java", "*********");// take duplicates and print whatever u want
			System.out.println(replace);
		}

		// String j = S.replaceAll("[A-Z]", "*");
		// System.out.println(j);

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

	private static void length() {
		// TODO Auto-generated method stub
		
	}

}
