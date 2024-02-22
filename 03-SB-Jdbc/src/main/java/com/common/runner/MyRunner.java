package com.common.runner;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.common.dao.PersonDao;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	PersonDao dao;
	@Override
	public void run(String... args) throws Exception {
		//dao.addPerson(2, "JULI", "FEMALE", 3);
		dao.editPerson(101, 35);
		//dao.deletePerson(2);
		//Map<String, Object> findPersonById = dao.findPersonById(101);
		//findPersonById.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+""+entry.getValue()));

	}

}
