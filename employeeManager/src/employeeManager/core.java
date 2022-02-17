package employeeManager;

public class core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericList<employee> employeeList = new GenericList<>();
		GenericList<role> roleList = new GenericList<>();
		GenericList<department> departmentList = new GenericList<>();
		
		employee name = new employee();
		role rolename = new role();
		department departmentname = new department();
		

		GenericObjectManager<employee> employeeManager =  new GenericObjectManager<employee>(employeeList, name);
		GenericObjectManager<role> roleManager = new GenericObjectManager<role>(roleList, rolename);
		GenericObjectManager<department> departmentManager = new GenericObjectManager<department>(departmentList,departmentname);
		
		command command = new command(employeeManager, roleManager, departmentManager);
		command.options();
		
		
		
	
	}

}
