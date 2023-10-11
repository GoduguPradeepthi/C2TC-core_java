package tnsif;

public class spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num=1412;
           int product=1;
           int sum=0;
           while(num>0);
           {
        	   int rem=num%10;
        	   sum=sum+rem;
        	   product=product*rem;
        	   num=num/10;
           }
           if(sum==product)
           {
        	   System.out.println("spy num");
           }
           else
           {
        	   System.out.println("not a spy num"); 
           }
	
	
	}

}
