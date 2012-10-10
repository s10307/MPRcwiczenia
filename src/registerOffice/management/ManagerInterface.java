package registerOffice.management;

import java.util.List;

public interface ManagerInterface<TEntity> {
	
	public TEntity get(/**/);
	public List<TEntity> getAll(/**/);
	public boolean save(/**/);
	public boolean delete(/**/);
	
	/**
	 * inne metody
	 */

}
