//** FileReader char array constructor */
import java.io.*;
class FileReaderDemo1
{
public static void main(String[] args) throws IOException
{
File f=new File("abc123.txt");
FileReader fr=new FileReader("abc123.txt");
char[] ch=new char[(int)f.length()];
fr.read(ch);
for(char ch1:ch)
{
	System.out.print(ch1);
}
fr.close();
}

}