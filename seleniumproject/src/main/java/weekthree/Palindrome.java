package weekthree;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =141,n =0;
		int i =0,j =0;
		n = a;
		while(a>0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a/10;
		}
		if(n==j) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
					
		}

	}

}
