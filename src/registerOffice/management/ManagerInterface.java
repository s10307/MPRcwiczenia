package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public interface ManagerInterface<TEntity> {
	
	public TEntity get(/**/);
	public List<TEntity> getAll(/**/);
	public boolean save(/**/);
	public boolean delete(/**/);
	
	/**
	 * inne metody
	 */

}
