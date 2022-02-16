package employeeManager;

public class core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericList<employee> employeeList = new GenericList<>();
		GenericList<role> roleList = new GenericList<>();
		GenericList<department> departmentList = new GenericList<>();
		command command = new command(employeeList, roleList, departmentList);
		command.options();
		
		
		
	
	}

}
