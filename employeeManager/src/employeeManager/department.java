package employeeManager;
import java.util.UUID;
public class department extends CollectionParent {
	private String name;
	private String id;
	

	public String getName() {
		return name;
	}
	@Override
	public String getId() {
		return id;
	}
	
	public department setObject(String name) {
		this.name = name;
		this.id = UUID.randomUUID().toString();
		return this;
	}
	

	@Override
	  public String toString() {
	    return name + "||" + id;
	 }
	
}
