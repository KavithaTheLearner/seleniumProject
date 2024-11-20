package weekthree;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s1 = new Scanner(System.in);
      System.out.println("enter the year:");
      int year = s1.nextInt();
      
      if(year%4 == 0&& year%100!= 0) {
      System.out.println("is a leap year" + year);
	}
	 else {
		System.out.println("is not a leap year" + year);
      
	}
      
	}

}
