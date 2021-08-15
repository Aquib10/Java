//Try & catch to handle checked & unchecked exception
import java.io.FileInputStream;
class Excep4
{
	public static void main(String args[])
	{
		//Checked Exception
		try
		{
			FileInputStream fis=new FileInputStream("D:/Personnel/Java/Practice/abc.java"); 
			//unreported exception FileNotFoundException; must be caught or declared to be thrown
		}
		catch(Exception e)
		{
			System.out.println(e); //caught exception in e & print
		}
	
		//Unchecked Exception e.g1	
		
		int a=10,b=0,c;
		try
		{
			System.out.println(1);
			System.out.println(2);
			System.out.println(c=a/b);	//contrl jump to catch after exception
			System.out.println(3);
		}
		catch(Exception e)
		{
			System.out.println(4);
			System.out.println(e);				// Name & description
			System.out.println(e.toString());		// Name & description	
			System.out.println(e.getMessage());		// description
			e.printStackTrace();				// Name , description & Trace
		}		



		//Unchecked Exception e.g2
		try
		{
		String s=null;
		System.out.println(s.length());	//java.lang.NullPointerException	
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
		finally
		{
			System.out.println("Finally : Is the block that is always executed whether exception is handled or not");	
		}

	}

}