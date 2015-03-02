package com.beastbikes.framework.persistence;

public abstract class AbstractDataAccessObject implements DataAccessObject {

	private final PersistenceManager persistenceManager;

	public AbstractDataAccessObject(PersistenceManager persistenceManager) {
		this.persistenceManager = persistenceManager;
	}

	@Override
	public PersistenceManager getPersistenceManager() {
		return this.persistenceManager;
	}

}
