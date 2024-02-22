package com.common.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.common.model.AccountEntity;
import com.common.model.AccountStatus;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
	
//List<AccountEntity>	findByStatus(AccountStatus status);
	
	/*
	 * @Query(value="select ae from AccountEntity ae where ae.creationTime=?1")
	 * Optional<AccountEntity> fetchAccountDetailsByCreationTime(LocalDateTime
	 * time);
	 */

	/*
	 * @Query(
	 * value="select ae from AccountEntity ae where ae.status=?1 and ae.balance=?2")
	 * List<AccountEntity> readAccounts(AccountStatus acc,Double bal);
	 */
	//@Query(value="select ae.accountId, ae.status,ae.balance from AccountEntity ae")
	@Query(value="select account_id,status,balance from accounts",nativeQuery = true)
	List<Object[]> readPartialDetailsofAccounts();
}
