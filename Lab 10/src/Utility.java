
public class Utility {
	public static int[] factorIt(int n)
	{
		int[] result = new int[2];
		for (int i=n-1; i>2; i++) {
            if ((n%i==0) && isPrime(i)) 
            {
            	result[0]=i;
            	result[1]=n/i;
            	return result;
            }
        }
		return result;
	}
	
	public static boolean isPrime(int m)
	{
		 for(int i=2;i<m;i++) {
		        if(m%i==0)
		            return false;
		    }
		    return true;
	}
}
