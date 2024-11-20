package weekthree;
import java.util.Scanner; 

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <= 1000; i++) {
			int a = i, n = 0; int k = 0, j = 0; n = a;
			while (a > 0) {
			k = a % 10;
			j = j + (k * k* k); a = a / 10;
			}
			if (n == j) {
			System.out.println(j);
  
   
   
   
			}
	}

	}
}
