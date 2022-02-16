package employeeManager;

import java.util.UUID;

public class employee {
	
	private String name;
	private int roleId;
	private UUID id;
	
	public employee(String name, int roleId, UUID id) {
		this.name = name;
		this.roleId = roleId;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	  public String toString() {
	    return name + "||" + roleId + "||" + id;
	 }
	

}
