/**
 * 
 */
package com.epam.spring.basics.springinadvance.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Krishnakanth_Yachare
 *
 */
@Component
public class PersonDAO {

	@Autowired
	private JdbcConnection jdbcConnection;

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

}
