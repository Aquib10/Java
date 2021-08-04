//Static variable example
class Emp1
{
	int empid;
	String empnm;
	static String city="Indore";
	double salary;

Emp1(){}			// not default constructor its user defined no arg or zero arg const.

Emp1(int empid,String empnm,double salary)  //parameterized const
{
	this.empid=empid;
	this.empnm=empnm;	
	this.salary=salary;
}
void setEmpData(int empid,String empnm,double salary)    //Instance Methode
{
	this.empid=empid;
	this.empnm=empnm;      				//this keyword refered to current object
	this.salary=salary;
}
void dispEmpData()					//Instance Methode
{
	System.out.println("Emp id:"+empid+"\nEmp Name:"+empnm+"\nEmp City:"+city+"\nEmp salary:"+salary);
}
static void dispEmpData1()
{
//System.out.println("Emp id:"+empid+"\nEmp Name:"+empnm+"\nEmp City:"+city+"\nEmp salary:"+salary);// non static member can't accessible in static area
System.out.println("Emp City:"+city);
}
}

class TestEmp1{
	public static void main(String args[])
	{
		Emp1 obj=new Emp1();     //this will initialise the Instance varible by default value i.e 0 & null
		obj.dispEmpData();
		obj.setEmpData(1001,"Ibrahim",50000);
		obj.dispEmpData();
		Emp1 obj1=new Emp1(1002,"Umar",60000);
		obj1.dispEmpData();
		System.out.println(obj.empnm);
		Emp1.city="Ujjain";		//static var is accessible by obj of class as well as class name 
		System.out.println(obj.city);
		System.out.println(Emp1.city);
		
	}
}