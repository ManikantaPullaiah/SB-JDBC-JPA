package com.common.runner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.common.model.AccountEntity;
import com.common.model.AccountStatus;
import com.common.repo.AccountRepository;

@Component
public class AccountRunner implements CommandLineRunner {
	
	@Autowired
	AccountRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * AccountEntity entity=new AccountEntity(); entity.setAccountId(10111);
		 * entity.setAccountName("SYTEN"); entity.setBalance(240000.0);
		 * entity.setStatus(AccountStatus.ACTIVE); repo.save(entity);
		 */
		
		/*
		 * Optional<AccountEntity> opt = repo.findById(10111); if(opt.isPresent()) {
		 * AccountEntity ae = opt.get(); ae.setBalance(5000.0); repo.saveAndFlush(ae); }
		 */
		/*
		 * List<AccountEntity> lst = repo.findByStatus(AccountStatus.ACTIVE);
		 * lst.forEach(System.out::println);
		 * 
		 */
		
		/*
		 * Optional<AccountEntity> opt =
		 * repo.fetchAccountDetailsByCreationTime(LocalDateTime.of(2024, 2, 21, 22, 30,
		 * 7, 869652000));
		 * 
		 * if(opt.isPresent()) { AccountEntity ae = opt.get(); System.out.println(ae); }
		 */
		
		/*
		 * List<AccountEntity> al = repo.readAccounts(AccountStatus.ACTIVE, 5000.0);
		 * al.forEach(System.out::println);
		 */
		
		List<Object[]> lst = repo.readPartialDetailsofAccounts();
		lst.forEach(obj->System.out.println(obj[0]+"===="+obj[1]+"======"+obj[2]));
	}

}
