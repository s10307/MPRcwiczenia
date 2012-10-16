package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public interface ManagerInterface<TEntity> {
	
	public TEntity get(int p);
	public List<TEntity> getAll();
	public boolean save(TEntity obj);
	public void delete(int a);
	
	
	/**
	 * inne metody
	 */

}
