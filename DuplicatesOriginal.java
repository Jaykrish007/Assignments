package Assignments;

public class DuplicatesOriginal {
	public static void main(String[] args) {
		String S = "We learn learn learn java basics as part of java sessions in java week1";
		int count = 0;

		String[] a = S.split(" ");

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {
				count = 0;
				if (a[i].equals(a[j]) || count >= 1) {

					count++;
					a[j] = "";

				}
				/*
				 * if(count>=1) { a[j]=""; }
				 */

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		/*
		 * //for (int j = 0; j < a.length; j++) {
		 * 
		 * //count++; //if(count>1) { S.replace(a[i]," "); System.out.println(a[i]); }
		 * 
		 */

	}
}
