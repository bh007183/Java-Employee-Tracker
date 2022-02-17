package employeeManager;

import java.util.UUID;

public class employee extends CollectionParent{
	
	private String name;
	private String roleId;
	private String id;
	

	public String getName() {
		return name;
	}
	@Override
	public String getId() {
		return id;
	}
	
	public employee setObject(String name, String roleId) {
		this.name = name;
		this.roleId = roleId;
		this.id = UUID.randomUUID().toString();
		return this;
	}
	
	@Override
	  public String toString() {
	    return name + "||" + roleId + "||" + id;
	 }

	

}
