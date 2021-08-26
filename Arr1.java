import java.util.Scanner;
class Arr1
{
public static void main(String[] args)
	{
     		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int x=sc.nextInt();
		int[] a=new int[x];
		System.out.println("Enter the value of arr element:"+x);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Elecment of your "+x+" arr are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}


}