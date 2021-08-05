package p2;
import p1.*;

class D extends AccessSpecifier    
{
	
	void disp()
	{
		System.out.println("In child public class form pkg1: "+pub1+" "+pro1+" "); 
	} 
		public static void main(String args[])
	{
		D d1=new D();
		d1.disp();

	}
}