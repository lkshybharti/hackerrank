package hacker;
import java.math.BigInteger;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger factorial;
		
		Scanner sc=new Scanner(System.in);
		
		BigInteger n=sc.nextBigInteger();
		
		calc obj = new calc();
		
		BigInteger  a = obj.fact(n);
		System.out.println(a);
		
		
	}
}

class calc
{

	BigInteger fact(BigInteger n)
	{ 
		BigInteger result;
		BigInteger o =new BigInteger("1");

		if(n== o)
		{
			return o;
		}
		
		BigInteger next = n.subtract(o);		
		BigInteger current = fact(next);	
		result = n.multiply(current);
		return result;
	
	}
}