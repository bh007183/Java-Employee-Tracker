package employeeManager;
import java.util.UUID;
public class department extends CollectionParent {
	
	private String name;
	private String id;
	
	public department(String name) {
		this.name = name;
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
	    return name + "||" + id;
	 }
	
}
