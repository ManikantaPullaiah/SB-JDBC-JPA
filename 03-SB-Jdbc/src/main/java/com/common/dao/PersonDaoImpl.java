package com.common.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.common.constants.AppConstants;

@Repository
public class PersonDaoImpl implements PersonDao {

	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public boolean addPerson(Integer pid, String name, String gender, int age) {
		try {
		template.update(AppConstants.PERSON_INSERT_QUERY,pid,name,gender,age);
		}catch(Exception ex)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean editPerson(Integer pid, int age) {
		try
		{
			template.update(AppConstants.PERSON_UPDATE_QUERY,pid,age);
		}catch(Exception ex)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean deletePerson(Integer pid) {
		try
		{
			template.update(AppConstants.PERSON_DELETE_QUERY,pid);
		}catch(Exception ex)
		{
			return false;
		}
		return true;
	}

	@Override
	public Map<String, Object> findPersonById(Integer pid) {
		
		return template.queryForMap(AppConstants.PERSON_FIND_QUERY,pid);
	}

}
