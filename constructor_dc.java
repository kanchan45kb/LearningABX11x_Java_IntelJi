package oopsConcept;

public class constructor_dc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// default constructor
		/* 	- Constructor is a **special method** which is invoked automatically at the time of** object creation.**
 			- It is used to **initialize the data members** (attributes) of new objects generally. 
			- Constructors have the **same name as class or structure. **
			- Constructors don’t have a return type. (Not even void)
			- Constructors are only called once, at **object creation.**
		 */
		Person P1 =new Person();
		// Person = Class code 
		// P1 = References
		// new Person method 
		new Person(); // one more type of method

	}

}
/*- **A constructor which has no argument** is known as non-parameterized constructor(or no-argument constructor). 
	- It is invoked at the time of creating an object. 
	- If we don’t create one then it is created by default by Java. */

class Person{ // Default constructor
	// Attributes name,age,IsMale,Phonenumber,Address
	
	  String name;
	  byte age;
	  boolean IsMale;
	  String phonenumber;
	  String Addressline1;
	  String Addressline2;	  
	
	  Person(){
		  name = "Ammi jack";
		  age = 31;
		  IsMale = false;
		  phonenumber = "9123428710"; 
		  Addressline1 = "1/2, Sai sadan, ABC Road";
		  Addressline2 = "Jamshednagar 12345";
		  System.out.println("Person name " + name);
		  System.out.println("Age "+age);
		  System.out.println(""+IsMale);
		  System.out.println(Addressline1+"; "+Addressline2);
	  }
	  
	  }
	  
	
