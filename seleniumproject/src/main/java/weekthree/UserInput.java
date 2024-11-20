package weekthree;
import java.util.Scanner;
public class UserInput {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num1,num2,result;
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the value 1");
          num1= input.nextInt();
          System.out.println("Enter the value 2");
          num2= input.nextInt();
          input.close();
           result=num1 - num2;
           System.out.printf("%d - %d =%d",num1,num2,result );
     
        
          
	}

}