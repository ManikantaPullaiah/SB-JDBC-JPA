package com.common.dao;

import java.util.Map;

public interface PersonDao {

	boolean addPerson(Integer pid, String name, String gender, int age);

	boolean editPerson(Integer pid, int age);

	boolean deletePerson(Integer pid);

	Map<String, Object> findPersonById(Integer pid);

}
