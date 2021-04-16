package Assignments;

public class PrimeNumber {
	public static void main(String[] args) {

		int a = 11;

		boolean flag = false;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {//reminder is 0 then flag is true,
				flag = true;
				
			}
			
		}
		
		if(flag==true) {
			
			System.out.println("NOT a Prime number:" + a);
		}
		else
		{
			System.out.println("Prime number:" + a);
			
		}
	}
}
