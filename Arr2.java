import java.util.*;
class Arr2
{
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	ArrMethode m=new ArrMethode();
	int[] arr=m.set();
	System.out.println("The elements of arr are ");
	m.get(arr);
	System.out.println("max value of element is "+m.max(arr));
	System.out.println("min value of element is "+m.min(arr));
	System.out.println("sum of values of element is "+m.sum(arr));
	System.out.println("Enter the element you want to find ");
	int f=sc.nextInt();
	if(m.find(arr,f)) System.out.println("element found in arr");
		else	System.out.println("element not found in arr");
}
}
class ArrMethode
{
int[] set()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int l=sc.nextInt();
	int[] arr=new int[l];
	System.out.println("Enter the elements of array");				
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
return arr;
}

void get(int[] arr)
{
	for(int i:arr)
	{
	System.out.println(i);
	}
}
int sum(int[] arr)
{
	int sum=0;
	for(int i:arr)
	{
		sum=sum+i;	
	}
return sum;
}


int max(int[] arr)
{
	int max=arr[0];
	for(int i:arr)
	{
		if(max<i)
		{
			max=i;
		}
	}
return max;
}

int min(int[] arr)
{
	int min=arr[0];
	for(int i:arr)
	{
		if(min>i)
		{
			min=i;
		}
	}
return min;
}
boolean find(int[] arr,int f)
{
	boolean b=false;
	for(int i:arr)
	{
		if(i==f)
		{
			b=true;
			break;
		}
	}
return b;
}
}