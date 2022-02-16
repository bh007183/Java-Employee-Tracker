package employeeManager;

import java.util.Scanner;
import java.util.UUID;

public class command {
	
	private GenericListInterface<employee> employee;
	private GenericListInterface<role> role;
	private GenericListInterface<department> department;
	private Scanner input = new Scanner(System.in);
	public command(
			GenericListInterface<employee> employee,
			GenericListInterface<role> role,
			GenericListInterface<department> department
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
		System.out.println("A: View Departments");
        System.out.println("B: View Roles");
        System.out.println("C: View Employees");
        System.out.println("D: Add Department");
        System.out.println("E: Add Role");
        System.out.println("F: Add Employee");
        System.out.println("G: Exit");
        
       
        
            char res = input.next().charAt(0);
            switch(res) {
            case 'A':
                department.viewAll();
   
                break;
            case 'B':
                role.viewAll();
                
                break;
            case 'C':
                employee.viewAll();
                
                break;
            case 'D':
               var departmentObject = department();
           	   department.add(departmentObject.getName(), departmentObject);
           	generalMessage("Department Created!");
           	
           	break;
            case 'E':
            	var roleObject = role();
            	role.add(roleObject.getName(), roleObject);
            	generalMessage("Role Created!");
            	
            	 break;
            case 'F':
            	var personObject = employee();
                employee.add(personObject.getName(), personObject);
                generalMessage("Employee Created!");
               
                break;
            case 'G':
            	generalMessage("Good by!");
            	break;
            	
            
            default:
            	generalMessage("Not an option! Please try again!");
            
            	break;
            }
          
        
  
            generalMessage("End of objecadfadf");
		
	}
	private employee employee() {
		System.out.println("Enter employees name:");
		String name = input.nextLine();
		System.out.println("Enter the role id for the employee:");
		int roleId = input.nextInt();
		UUID id =  UUID.randomUUID();
		return new employee(name, roleId, id);
	}
	
	private department department() {
		System.out.println("Enter Department name:");
		String name = input.nextLine();
		UUID id =  UUID.randomUUID();
		return new department(name, id);
		
	}
	private role role() {
		System.out.println("Enter Role name:");
		String name = input.nextLine();
		UUID id =  UUID.randomUUID();
		return new role(name, id);
		
	}

}
