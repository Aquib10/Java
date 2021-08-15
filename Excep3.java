//Checked Exception example
import java.io.FileInputStream;
class Excep3
{
	public static void main(String args[])
	{
		FileInputStream fis=new FileInputStream("D:/Personnel/Java/Practice/abc.java"); 
/*unreported exception FileNotFoundException; must be caught or declared to be thrown
*/FileInputStream fis=new FileInputStream("D:/Personnel/Java/Practice/abc.java");
	}

}