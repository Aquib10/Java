//** BufferedWriter  */
import java.io.*;
class BufferedWriterDemo	
{
public static void main(String[] args) throws IOException
{
FileWriter fw=new FileWriter("abc.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write(97);
bw.newLine();
bw.write("Hi i am learning javaio package");
bw.flush();
bw.close();
}
}
