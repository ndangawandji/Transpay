/**
 * Copyright (c) 2022 ndgwandji.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://www.ndangawa.it/opensources/transpay/LICENSE.txt
 */
package it.ndangawa.transpay.eis.dao;

import java.util.List;
import oracle.jdbc.OracleConnection;

import it.ndangawa.transpay.eis.cloud.OracleCloudDB;

/**
 * @author Ndanga Wandji
 *
 */
public abstract class AbstractGenericDAO<T, ID> {
	
	private Class<T> datasClass;
	private static OracleConnection connection;

	/**
	 * 
	 */
	public AbstractGenericDAO() {
		// TODO Auto-generated constructor stub
		connection = new OracleCloudDB().getConnection();
	}
	
	
	public abstract boolean create(T object);
	
	public abstract void deleteById(ID id);
	
	public abstract List<T> readAll();
	
	public abstract T readById(ID id);

	/**
	 * @return the connection
	 */
	public static OracleConnection getConnection() {
		return connection;
	}

	

}
