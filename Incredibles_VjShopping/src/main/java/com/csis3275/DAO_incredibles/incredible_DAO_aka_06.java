package com.csis3275.DAO_incredibles;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.csis3275.model_incredibles.Incredible_mapper_aka_06;
import com.csis3275.model_incredibles.Register;

@Component
public class incredible_DAO_aka_06 {

	JdbcTemplate jdbcTemplate;
	 
	private final String SQL_GET_ALL = "select * from registration";
	private final String SQL_INSERT_Admin = "insert into registration(firstname, lastname,email,password,phoneNumber) values(?,?,?,?,?)";
	private final String FIND_USER = "select * from registration where email=? and pass=?";
	
	
	@Autowired
	public incredible_DAO_aka_06(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Register> getAllAdmin() {
		return jdbcTemplate.query(SQL_GET_ALL, new Incredible_mapper_aka_06());
	}

	public boolean createNewAdmin(Register admin) {
		return jdbcTemplate.update(SQL_INSERT_Admin, admin.getFirstName(), admin.getLastName(), admin.getEmail(),
				admin.getPassword(), admin.getPhoneNumber()) > 0;
	}
	

	public boolean authenticateAdmin(String userName,String password)
    {try {
        String userNameDB = (String) jdbcTemplate.queryForObject(
       		 "SELECT email FROM REGISTRATION WHERE email ="+"'"+userName+"'", new Object[] {}, String.class);
        String passwordDB = (String) jdbcTemplate.queryForObject(
       		 "SELECT TOP 1 password FROM REGISTRATION WHERE password ="+"'"+password+"'", new Object[] {}, String.class);
        if(userName.equals(userNameDB) && password.equals(passwordDB)){
		      return true;
		      }
		   else {
            return false;}}
        catch (EmptyResultDataAccessException e) {
               e.printStackTrace();
           }
    return false;
       
    }

	     
}
