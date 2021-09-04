//** String constructors & Methode */
class Str
{
public static void main(String[] args)
{
	
	String a1=new String("Java");		//String obj
	String a2=new String("Java");		//String obj
	String a3="prog";					//String literal
	String a4="prog";					//String literal
	System.out.println(a1==a2);			//false Address or reference comparision
	System.out.println(a3==a4);			//true	Address or reference comparision	
	System.out.println(a1.equals(a2));	//true content comparision
	System.out.println(a3.equals(a4));	//true content comparision

	
	StringBuffer sb=new StringBuffer("voda");
	sb.append("idea");
	System.out.println(sb);  					// string buffer is mutable in nature
	StringBuffer sb1=new StringBuffer("Hello");
	StringBuffer sb2=new StringBuffer("Hello");
	System.out.println(sb1==sb2);				//false add or ref comparision
	System.out.println(sb1.equals(sb2));		//false equals() not overridden in sb

//String constructors
String s1=new String();					//empty string
System.out.println(s1.length());			// len 0

String s2=new String("Hello");		// Strng literal	

String s3=new String(sb1);			//String object equivalent to SB
System.out.println(s3);

char[] ch={'A','r','r','a','y'};
String s4=new String(ch);
System.out.println(s4);

byte[] b={97,98,99,100};
String s5=new String(b);
System.out.println(s5);

String s6=" String with Space at begining & end ";
//Methods of String

System.out.println(s4.charAt(3));	//char charAt(int index) return char

System.out.println(s4.concat(" "+s5));

System.out.println("java".equalsIgnoreCase("JAVA"));  //true boolean equalIgnoreCase(String s)

System.out.println(a1.equals(a2));	//true content comparision

System.out.println(s2.substring(2));

System.out.println(s2.substring(2,4));

System.out.println(s2.length());

System.out.println(s2.toLowerCase());

System.out.println(s2.toUpperCase());

System.out.println(s6.trim());

System.out.println(s6.replace('e','r'));

System.out.println(s4.indexOf('r'));	// return inedx of first occurence 

System.out.println(s4.lastIndexOf('r'));	//return inedx of last occurence 


}


}