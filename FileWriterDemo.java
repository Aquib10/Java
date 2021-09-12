//** FileWriter*/
import java.io.*;
class FileWriterDemo
{
public static void main(String[] args) throws IOException
{
//FileWriter fw=new FileWriter("abc123.txt");
FileWriter fw=new FileWriter("abc123.txt",true);
fw.write(97);
fw.write("\nHi\nWelcom in java learning");
char[] ch={'c','h','a','r'};
fw.write("\n");
fw.write(ch);
fw.write("\n");
fw.write('a');
fw.flush();
fw.close();
}

}