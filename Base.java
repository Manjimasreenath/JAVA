abstract class Emp{
	abstract void printInfo();
	}
class Employee extends Emp{
	void printInfo()
	{
		String name="avinash";
		int age=21;
		float salary=2222.2F;
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}
class Base{
	public static void main(String args[])
	{
		Emp s=new Employee();
		s.printInfo();
		}
	}
