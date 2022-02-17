package employeeManager;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class GenericList <T> implements GenericListInterface <T>{
	private Map<String, T> list = new Hashtable<>();
	
	@Override
	public void add(String name, T item) {
		list.put(name, item);
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
	public void remove() {
		
	}

	
	

}
