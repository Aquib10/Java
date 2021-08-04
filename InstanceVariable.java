//Instance variable example
class Emp
{
	int empid;
	String empnm;
	String city="Indore";
	double salary;

Emp(){}			// not default constructor its user defined no arg or zero arg const.

Emp(int empid,String empnm,double salary)  //parameterized const
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
}
class TestEmp{
	public static void main(String args[])
	{
//Instance varible can't use in static area without object in same or different class
		Emp obj=new Emp();     //this will initialise the Instance varible by default value i.e 0 & null
		obj.dispEmpData();
		obj.setEmpData(1001,"Ibrahim",50000);
		obj.dispEmpData();
		Emp obj1=new Emp(1002,"Umar",60000);
		obj1.dispEmpData();
		System.out.println(obj.empnm);
	}
}