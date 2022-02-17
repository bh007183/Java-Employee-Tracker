package employeeManager;

import java.util.UUID;

public class employee extends CollectionParent{
	
	private String name;
	private String roleId;
	private String id;
	
	public employee(String name, String roleId) {
		this.name = name;
		this.roleId = roleId;
		this.id = UUID.randomUUID().toString();
		
	}
	

	public String getName() {
		return name;
	}
	@Override
	public String getId() {
		return id;
	}
	
	
	
	@Override
	  public String toString() {
	    return name + "||" + roleId + "||" + id;
	 }

	

}
