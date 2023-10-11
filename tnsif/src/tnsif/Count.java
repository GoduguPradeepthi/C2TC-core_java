package tnsif;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int num = 8757565;
             int count = 0;
             while(num>0)
             {
            	 int rem = num%10;
            	 count ++;
            	 num = num/10;
             }
            	System.out.println(count);

	}

}
