import java.io.*;
class FileIO
{
public static void main(String[] args){
File f=new File("abc123.txt");
try{
f.createNewFile();
System.out.println(f.exists());
}
catch(Exception e)
{
		System.out.println(e);
}

File f1=new File("IO Prog");
f1.mkdir();
System.out.println(f.exists());

int count=0;
File f2=new File("D:\\Personnel\\Java\\practice");
String[] s=f2.list();
for(String s1:s)
{	
File f3=new File(f2,s1);
if(f3.isDirectory())			//isFile() can be used for Files
{	
	count++;
	System.out.println(s1);
}
}
System.out.println(count);
File f5=new File("D:\\Personnel\\Java\\practice\\Arr1.java");
System.out.println(f5.length());   // Returns the char length in file
}

}