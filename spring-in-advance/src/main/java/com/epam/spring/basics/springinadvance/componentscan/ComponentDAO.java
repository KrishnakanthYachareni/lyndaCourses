/**
 * 
 */
package com.epam.spring.basics.springinadvance.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Krishnakanth_Yachare
 *
 */
@Component
public class ComponentDAO {

	@Autowired
	private ComponentJdbcConnection jdbcConnection;

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

}
