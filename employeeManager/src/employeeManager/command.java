package employeeManager;

import java.util.Scanner;
import java.util.UUID;

public class command {
	
	private GenericObjectManagerInterface<employee> employee;
	private GenericObjectManagerInterface<role> role;
	private GenericObjectManagerInterface<department> department;
	private Scanner input = new Scanner(System.in);
	public command(
			GenericObjectManagerInterface<employee> employee,
			GenericObjectManagerInterface<role> role,
			GenericObjectManagerInterface<department> department
			) {
		this.employee = employee;
		this.role = role;
		this.department = department;	
	}
	
	private void generalMessage(String message) {
		System.out.println(message);
	}
	
	public void options() {
		generalMessage("What would you like to do?");
		System.out.println("A: Manage Employees");
        System.out.println("B: Manage Departments");
        System.out.println("C: Manage Roles");
        System.out.println("G: Exit");
        
       
        
            char res = input.next().charAt(0);
            switch(res) {
            case 'A':
                employee.options("Employee");
                options();
   
                break;
            case 'B':
                department.options("Department");
                
                break;
            case 'C':
                role.options("Role");
                
                break;
            case 'G':
            	generalMessage("Good by!");
            	break;
            	
            
            default:
            	generalMessage("Not an option! Please try again!");
            	break;
            }
          
   
            generalMessage("End of Method");
		
	}
	
	

}
