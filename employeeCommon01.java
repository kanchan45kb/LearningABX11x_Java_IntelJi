package Oops_MultilevelInheritance;

public class employeeCommon01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentcompany per1 = new childcompany();
		per1.product(); // it brings data from Method(childcompany) not from reference.this is 
						// Dynamic Dispatch
		per1.turnoverparent();
		System.out.println("Parentcompany has no of employee " +per1.no_of_employee);
		// System.out.println(per1.child_employee); this is not possible.
		
		System.out.println("---------------------");
        parentcompany per2 = new vendor();
        per2.product();
        per2.turnoverparent();
       
        System.out.println("-------------------------");
        
        // childcompany chi1 = new  parentcompany(); this is not possible
        childcompany chi1 = new vendor();
        chi1.product();   
        System.out.println("No of Employees in childcompany are "+chi1.child_employee);
        System.out.println("No of Employee in Parentcompany are " +chi1.no_of_employee);
        chi1.turnoverchild();
        chi1.turnoverparent();
        
	}

}
