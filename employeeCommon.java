package Oops_MultilevelInheritance;

public class employeeCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentcompany pern = new parentcompany();
		pern.turnoverparent();
		pern.product();
		System.out.println("------------------------");
		
		childcompany chicom = new childcompany();
		chicom.turnoverchild();
		System.out.println(chicom.no_of_employee);
		chicom.turnoverparent();
		chicom.product();
		
		System.out.println("--------------------------");
        vendor ven = new vendor();
       System.out.println(ven.no_of_employee);;
        ven.turnover_vendor();
        ven.turnoverchild();
        ven.turnoverparent();
        ven.product();
       

	}

}
