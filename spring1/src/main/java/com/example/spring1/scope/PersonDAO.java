package com.example.spring1.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {
	
	@Autowired
	JDBCConnection jdbcCon;

	public JDBCConnection getJdbcCon() {
		return jdbcCon;
	}

	public void setJdbcCon(JDBCConnection jdbcCon) {
		this.jdbcCon = jdbcCon;
	}
	
	

}
