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
        Scanner in = new Scanner(System.in);
       
        while(true) {
            char input = in.next().toCharArray()[0];
            switch(input) {
            case 'A':
                department.viewAll();
                options();
            case 'B':
                role.viewAll();
                options();
            case 'C':
                employee.viewAll();
                options();
            case 'D':
               var departmentObject = department();
           	   department.add(departmentObject.getName(), departmentObject);
           	generalMessage("Department Created!");
           	 options();
            case 'E':
            	var roleObject = role();
            	role.add(roleObject.getName(), roleObject);
            	generalMessage("Role Created!");
            	 options();
            case 'F':
            	var personObject = employee();
                employee.add(personObject.getName(), personObject);
                generalMessage("Employee Created!");
                options();
            case 'G':
            	generalMessage("Good by!");
            	break;
            	
            
            default:
            	continue;
            }
            
        }
        
       
       
		
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
		System.out.println("Enter Department name:");
		String name = input.nextLine();
		UUID id =  UUID.randomUUID();
		return new role(name, id);
		
	}

}
