package Assignments;

public class OddindexToUpperCase {
	public static void main(String[] args) {




		String s = "Jayakrishna";//index is--> 012345678910


		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (i%2!=0)
			{
				char upperCase = Character.toUpperCase(ch[i]);//character.touppercase()
				System.out.println( upperCase +  "--the postiton of the changing odd index is :-- " + i);
				//String a = Character.toString(ch[i]);//changed into string
				//System.out.println(a.toUpperCase() +" --the postiton of the changing odd index is :--" + i);//use the upper case method
			}

			else
			{
				System.out.println(ch[i]);
			}

		}



	}
}






	


