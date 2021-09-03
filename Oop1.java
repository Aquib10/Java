/** parameterized constructor, inheritance,methode overriding */
import java.util.Scanner;
abstract class Shape{
	int width;
	abstract void area();
}

class Square extends Shape{
	Square(int e)
	{
		width=e;
	}
	void area()
	{
		System.out.println(width*width);
	}
}

class Circle extends Shape{
	Circle(int e){
		width=e;
	}
	void area(){
	System.out.println(Math.PI*width*width);
	}
}


public class Oop1{
	public static void main(String[] args){
		System.out.println("Enter the edge of square & radius of circle respectively ");
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt();
		int r=sc.nextInt();
		Square a=new Square(e);
		Circle b=new Circle(r);
a.area();
b.area();
}
} 