package oopsConcept;

public class parameterconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// parameter constructor 
		/*- Constructor which has parameters is called a parameterized constructor. 
		 - It is used to provide different values to distinct objects. */
		Person1 p2 = new Person1();
		Person1 p3 = new Person1("Mina",19,"722819101",false,"1/2,jackson");
		System.out.println(p2.name+", "+p2.age+" ,"+p2.phonenumber+" ,"+p2.IsMale +" ,"+p2.Address);
		System.out.println(p3.name+", "+p3.age+", "+p3.phonenumber+", "+p3.IsMale +", "+p3.Address);

	}

}
class Person1{
	   String name;
	   int age;
	   String phonenumber;
	   boolean IsMale;
	   String Address;
	    
	    Person1()
	    {
	    	name = "Joseph";
	    	age = 21;
	    	phonenumber ="123456454";
	    	IsMale = true;
	    	Address = "1/2, ABC";
	    }
	    Person1(String name_arg,int age_arg,String phonenumber_arg,boolean IsMale_arg,String Address_arg )
	    {
	    	this.name = name_arg;
	    	this.age = age_arg;
	    	this.phonenumber = phonenumber_arg;
	    	this.IsMale = IsMale_arg;
	    	this.Address = Address_arg;
	    	
	    }
	    }
	
