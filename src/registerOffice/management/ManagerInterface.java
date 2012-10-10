package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public interface ManagerInterface<TEntity> {
	
	public TEntity get(Condition<TEntity> condition);
	public List<TEntity> getAll(/**/);
	public boolean save(Person p);
	public boolean delete(Person p);
	
	/**
	 * inne metody
	 */

}
