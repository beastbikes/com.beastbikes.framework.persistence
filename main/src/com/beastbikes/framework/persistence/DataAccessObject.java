package com.beastbikes.framework.persistence;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

/**
 * {@link DataAccessObject} interface is used for persistent data accessing
 * 
 * @author johnson
 * 
 */
public interface DataAccessObject<T extends PersistentObject> {

	public PersistenceManager getPersistenceManager();

	/**
	 * Returns the number of rows
	 * 
	 * @return the number of rows
	 * @throws PersistenceException
	 */
	public long count() throws PersistenceException;

	/**
	 * Returns the persistent object with the specified id
	 * 
	 * @param id
	 * @return
	 * @throws PersistenceException
	 */
	public T get(Serializable id) throws PersistenceException;

	/**
	 * Returns all persistent objects
	 * 
	 * @return all persistent objects
	 * @throws PersistenceException
	 */
	public List<T> getAll() throws PersistenceException;

	/**
	 * Save the specified object into storage
	 * 
	 * @param po
	 *            The object to be inserted into storage
	 * @throws PersistenceException
	 */
	public void insert(T po) throws PersistenceException;

	/**
	 * Update the specified object which has already exist in storage
	 * 
	 * @param po
	 *            The object to be updated
	 * @throws PersistenceException
	 */
	public void update(T po) throws PersistenceException;

	/**
	 * Delete the specified object which has already exist in storage
	 * 
	 * @param po
	 *            The object to be deleted
	 * @throws PersistenceException
	 */
	public void delete(T po) throws PersistenceException;

	/**
	 * Delete the persistent object with specified id
	 * 
	 * @param id
	 * @throws PersistenceException
	 */
	public void delete(Serializable id) throws PersistenceException;

	/**
	 * Query data set with the specified SQL
	 * 
	 * @param sql
	 *            The query SQL
	 * @param args
	 *            The arguments of the specified SQL
	 * @return The data set
	 * @throws PersistenceException
	 */
	public ResultSet query(String sql, String... args)
			throws PersistenceException;

	/**
	 * Execute raw SQL with the specified arguments
	 * 
	 * @param sql
	 *            The SQL to be executed
	 * @param args
	 *            The arguments of the specified SQL
	 * @return
	 * @throws PersistenceException
	 */
	public void execute(String sql, Object... args) throws PersistenceException;

}
