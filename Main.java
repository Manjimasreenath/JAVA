import java.util.*;
class Person{
	String name;
	String gender;
	String address;
	int age;
Person(String name,String gender,String address,int age){
	this.name=name;
	this.gender=gender;
	this.address=address;
	this.age=age;
	}
}
class Employee extends Person{
	int empid;
	String companyname;
	String Qualification;
	double salary;
Employee(String name,String gender,String address,int age,int empid,String companyname,String Qualification,double salary){
	super(name,gender,address,age);
	this.empid=empid;
	this.companyname=companyname;
	this.address=address;
	this.salary=salary;
	}
}
class Teacher extends Employee{
	String subject;
	String department;
	int teacherId;
Teacher(String name,String gender,String address,int age,int empid,String companyname,String Qualification,double salary,String subject,String department,int teacherId){
	super(name,gender,address,age,empid,companyname,address,salary);
	this.subject=subject;
	this.department=department;
	this.teacherId=teacherId;
	}
	public void display(){
		System.out.println("Teacher Id:"+teacherId);
		System.out.println("Name:"+name);
		System.out.flush();
		System.out.println("Gender:"+gender);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
		System.out.println("Employee ID:"+empid);
		System.out.println("Company Name:"+companyname);
		System.out.println("Qualification:"+Qualification);
		System.out.println("Salary:"+salary);
		System.out.println("Subject:"+subject);
		System.out.println("Department:"+department);
	}
}
class Main{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of teachers:");
	int n=sc.nextInt();
	Teacher[] teachers=new Teacher[n];
	for(int i=0;i<n;i++){
		System.out.println("Enter the details of teachers"+(i+1)+":");
		System.out.print("Name:");
		String name=sc.next();
		
		System.out.print("Gender:");
		String gender=sc.next();
		
		System.out.print("Address:");
		String address=sc.next();
		
		System.out.print("Age:");
		int age=sc.nextInt();
		
		System.out.print("Employee ID:");
		int empid=sc.nextInt();
		
		System.out.print("Company name:");
		String companyname=sc.next();
		
		System.out.print("Qualification:");
		String Qualification=sc.next();
		
		System.out.print("salary:");
		double salary=sc.nextDouble();
		
		System.out.print("Subject:");
		String subject=sc.next();
		
		System.out.print("Department:");
		String department=sc.next();
		
		System.out.print("Teacher Id:");
		int teacherId=sc.nextInt();
		
		teachers[i]=new Teacher(name,gender,address,age,empid,companyname,Qualification,salary,subject,department,teacherId);
		
		}
		System.out.println("\n----Details of teachers---");
for(int i=0;i<teachers.length;i++){
	teachers[i].display();
	System.out.println();
	}
	}
	}

		
