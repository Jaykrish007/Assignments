package Assignments;

public class SumOfDigitsInString {
	public static void main(String[] args) {

/*		String s="Tes12Le79af65";
		int sum =0;
	String s1=s.replaceAll("[A-Z,a-z]","");
		char[] c= s1.toCharArray();
	for(int i =0; i< c.length;i++)

		{
			int numericValue = Character.getNumericValue(c[i]);
			sum   = sum + numericValue;
		}		System.out.println(sum);*/
		
		
		String s="Tes12Le79af65";
		int sum =0;
		
		char[] Array = s.toCharArray();
		for(int i =0;i <Array.length;i++)
		{
			if(Character.isDigit(Array[i]))
			{
			sum =  sum + Character.getNumericValue(Array[i]);
			
		} 
		
	
			//System.out.println(n);
	}
		System.out.println(sum);
}
}

