//Access Specifier
package p1;
class A
{
	String d="default";
	public String pub="public";
	protected String pro="protected";	
	private String pri="private";
	
	void disp()
	{
		System.out.println("In Same class A "+d+" "+pub+" "+pro+" "+pri);
	}
}

class B extends A	//child of A
{
	void disp()
	{
		System.out.println("In child of A "+d+" "+pub+" "+pro);  //private member can't be inherit
	} 
}

class C			// non drive class
{
	A obj=new A();
	void disp()
	{
		System.out.println("In Same pack non drive class "+obj.d+" "+obj.pub+" "+obj.pro);
	}
}
public class AccessSpecifier
{
	String d1="default";
	public String pub1="public";
	protected String pro1="protected";	
	private String pri1="private";

	public static void main(String arg[])	
	{
		A a1=new A();
		a1.disp();
		B b1=new B();
		b1.disp();
		C c1=new C();
		c1.disp();
	}
}






