package employeeManager;

import java.util.UUID;

public class role {
	private String name;
	private UUID id;
	
	public role(String name, UUID id) {
		this.name = name;
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	
	@Override
	  public String toString() {
	    return name + "||" + id;
	 }

}
