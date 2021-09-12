//** PrintWriter  */
import java.io.*;
class PrintWriterDemo	
{
public static void main(String[] args) throws IOException
{
PrintWriter pw=new PrintWriter("abc.txt");
pw.write(97);
pw.println(100);
pw.println("Hi i am learning javaio package");
pw.flush();
pw.close();
}
}
