package tnsif;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int num = 333;
            int temp = num;
            int rev =0;
            while (num>0)
            {
            	int rem = num%10;
            	rev = rev*10+rem;
            	num = num/10;
            }
                 if (rev==temp)
                 {
                	 System.out.println("Palindrome num");
                 }
                 else
                 {
                	 System.out.println("not");
            }
	}

}
