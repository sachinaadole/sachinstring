package overlaod;
import java.util.*;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class Eoverload 
{
	public float maths(int a, int b)
	{
		int x;
		x=a+b;
		System.out.println("addition is="+x); 
		return x;
		
	}
	public void maths(int leght, int breadth,float x ) 
	{
		float area;
		area=x*leght*breadth;
		System.out.println("area is="+area );
		
		
	}
	public void maths(int leght, int breadth,float x ,long y) 
	{
		float area;
		area=x*leght*breadth+y;
		System.out.println("area of rectangle is="+area );
		
		
	}
	public static void main(String[] args) 
	{
		Eoverload er=new Eoverload();
		er.maths(10,10);
		er.maths(10,5,2);
		er.maths(5,4,3,2);
		SS s1=new SS();
		s1.maths(10,2);
	}

}
	class SS extends Eoverload{
		
		public float maths(int a, int b)
		{
			int z=a*b;
			System.out.println("multiplication of two no is="+z);
			return z;
		}
			}
	
	
