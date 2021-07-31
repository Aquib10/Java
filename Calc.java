// Calulator for Arithmetic Operations
import java.util.Scanner;
class Calc
{
	public static void main(String args[])
{
	int a,b,ch;
	Scanner sc=new Scanner(System.in);
do{
	System.out.println("Select the choice of opeation\n 1 for Add\n 2 for Sub\n 3 for Mul\n 4 for Div\n 5 for Mod\n 6 for Exit");
	ch=sc.nextInt();
		
	switch(ch)
	{
		case 1://for addtion 
		System.out.println("Enter the value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum of a & b is "+(a+b));
		break;
		case 2://for Subtraction
		System.out.println("Enter the value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sub of a & b is "+(a-b)); 	
		break;
		case 3://for Mult
		System.out.println("Enter the value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Mul of a & b is "+(a*b)); 	
		break;
		case 4://for Div
		System.out.println("Enter the value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Div of a & b is "+(a/b)); 	
		break;
		case 5://for Mod
		System.out.println("Enter the value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Mod of a & b is "+(a%b)); 	
		break;
		default:
		System.out.println("kindly select a valid option");
		break;
	}
}while(ch!=6);
}
}