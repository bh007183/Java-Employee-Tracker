package employeeManager;

import java.util.Scanner;

public class core {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		GenericList<employee> employeeList = new GenericList<>();
		GenericList<department> departmentList = new GenericList<>();
		GenericList<role> roleList = new GenericList<>();
		
		System.out.println("What would you like to do?");
		System.out.println("A: View a Collection");
        System.out.println("B: Remove an Item from a Collection");
        System.out.println("C: Add an item to a Collection");
        System.out.println("G: Exit");
        char res = input.next().charAt(0);
        switch(res) {
        case 'A':
        	new ViewCollection(employeeList, departmentList, roleList);
            break;
        case 'B':
        	new RemoveCollection(employeeList, departmentList, roleList);
            break;
        case 'C':
            
            
            break;
        case 'G':
        	System.out.println("Good by!");
        	break;
        	
        
        default:
        	System.out.println("Not an option! Please try again!");
        
        }
      

        System.out.println("End of Method");
		
	        
	         
			
	}

}
