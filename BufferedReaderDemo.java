//** BufferedReader Line by line*/
import java.io.*;
class BufferedReaderDemo
{
public static void main(String[] args) throws IOException
{
FileReader fr=new FileReader("abc123.txt");
BufferedReader br=new BufferedReader(fr);
String str=br.readLine();
while(str!=null)
{
	System.out.println(str);
	str=br.readLine();
}
br.close();
}

}