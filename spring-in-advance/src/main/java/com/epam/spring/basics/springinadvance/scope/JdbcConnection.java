package com.epam.spring.basics.springinadvance.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/*
 * This class autowired in PersonDAO class. For every request of PErsonDAO will
 * create the new instance of JDBC if we use proxyMode otherwise it can use the
 * same instance for all the time even if we use Prototype scope. Because we are
 * not get the bean of JDBC instead personDAO
 */
@Scope(value = "ConfigurableBeanFactory.SCOPE_PROTOTYPE", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC connection");
	}
}
