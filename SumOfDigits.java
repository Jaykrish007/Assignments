package Assignments;

public class SumOfDigits {
	public static void main(String args[]) {

		int a=123;
		int k = a;

		int rem = 0;
		int sum= 0;

		while(a>0)
		{

			rem =  k%10;
			//System.out.println(rem); rem is 3,2,1

			sum = sum + rem;

			k= k/10;
			//System.out.println(a);quotient is 12,2,0

		}


		System.out.println( "The number is:  "  + k );
		System.out.println( "The SUM OF  the number is:"    +  sum);







	}
}
