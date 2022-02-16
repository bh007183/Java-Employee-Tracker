package employeeManager;

public interface GenericListInterface <T> {
	
    void add(String name, T item);
	void searchName(String name);
	void viewAll();
	
	

}
