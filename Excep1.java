//Uncheck Exception
class Excep1
{
	public static void main(String args[])
	{	
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0); //Uncheked Exception in thread "main" java.lang.ArithmeticException: / by zeroat Excep1.main(Excep1.java:8)
		System.out.println(5);
		System.out.println(6);
	}
}