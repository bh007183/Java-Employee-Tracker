package employeeManager;

public interface GenericListInterface <T> {
	
    void add(T item);
	void searchName(String name);
	void viewAll();
	void removeItem(String id);
	

}
