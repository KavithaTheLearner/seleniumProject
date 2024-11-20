package weekthree;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name = "madam";
       String res="";
       for(int i=name.length()-1;i>=0;i--) {
    	   char ch = name.charAt(i);
    	   res =res + ch;
    	   
       }
       if(res.equals(name)) {
    	   System.out.println(" palindrome string");
       }else {
    	   System.out.println(" not palindrome string");
       }
    	   
       }
}

