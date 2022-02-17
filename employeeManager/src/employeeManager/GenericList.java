package employeeManager;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class GenericList <T extends CollectionParent> implements GenericListInterface <T>{
	private Map<String, T> list = new Hashtable<>();
	
	@Override
	public void add(T item) {
		list.put(item.getId(), item);
	}
	@Override
	
	public void searchName(String name) {
		System.out.println(list.get(name).toString());
		
	}
	@Override
	public void viewAll() {
		Iterator<T> values = list.values().iterator();
		while( values.hasNext() ){
		    System.out.println( values.next().toString());
		}
	}

	@Override
	public void removeItem(String id) {
		// TODO Auto-generated method stub
		list.remove(id);
		
	}

	
	

}
