package employeeManager;

import java.util.UUID;

public class role extends DatabaseClass implements GenericObjectInterface{
	private String name;
	private String id;
	

	
	public String getName() {
		return name;
	}
	public role setObject(String name) {
		this.name = name;

		this.id = generateId();
		return this;
	}
	
	@Override
	  public String toString() {
	    return name + "||" + id;
	 }
	@Override
	public role setObject(String name, String id) {
		// TODO Auto-generated method stub
		return this;
		
	}

}
