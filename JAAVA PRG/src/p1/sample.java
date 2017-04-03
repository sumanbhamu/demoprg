package p1;

public class sample {
	
	
	    public int aMethod()
	    {
	    	
		/*
		 * Compilation failed because static was an illegal start of expression
		 * - method variables do not have a modifier (they are always considered
		 * local).
		 */
	        /*static*/ int i = 0;
	        i++;
	        return i;
	    }
	    public static void main(String args[])
	    {
	    	/*sample test = new sample();
	        test.aMethod();
	        int j = test.aMethod();
	        System.out.println(j  +"   ...   "+test.aMethod());*/
	    	int x = 11 & 9;
	        int y = x ^ 3;
	        System.out.println( y /*| 12*/+"....."+x );
	    }


}
