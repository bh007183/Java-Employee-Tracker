package employeeManager;

import java.util.UUID;

public class employee extends DatabaseClass implements GenericObjectInterface {
	
	private String name;
	private String roleId;
	private String id;
	

	public String getName() {
		return name;
	}
	@Override
	public employee setObject(String name, String roleId) {
		this.name = name;
		this.roleId = roleId;
		this.id = generateId();
		return this;
	}
	
	@Override
	  public String toString() {
	    return name + "||" + roleId + "||" + id;
	 }
//	Should not have to use....need to figure out.
	@Override
	public employee setObject(String name) {
		// TODO Auto-generated method stub
		return this;
		
	}
	

}
