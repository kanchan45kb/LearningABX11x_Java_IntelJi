package oopsConcept;

public class parameterconstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E = new Employee("Amit",25000,true,"ABC");
		Employee E2 = new Employee("Sonali",30000);
		Employee E3 = new Employee();
		E3.name= "Joseph";
		System.out.println(E3.name +" is employee of company");
		System.out.println(E.name +" has salary "+E.salary+" "+E.IsMale+" leaves at address "+E.Address);
		System.out.println(E2.name+ " has salary " + E2.salary);
		
		E.eat();
		E2.walk();
		
	}

}

class Employee
{
	String name;
	long salary;
	boolean IsMale;
	String Address;
	Employee(String name_arg,long salary_arg,boolean IsMale_arg,String Address)
	{
		this.name = name_arg;
		this.salary = salary_arg;
		this.IsMale = IsMale_arg;
		this.Address = Address;
		
	}
	Employee(){
		
	}
	Employee(String name,long salary){
		this.name = name;
		this.salary = salary;
	}
	void eat() {
		System.out.println(this.name + " is eat NonVeg");
	}
	void walk() {
		System.out.println(this.Address + " its very far away");
	}
}
