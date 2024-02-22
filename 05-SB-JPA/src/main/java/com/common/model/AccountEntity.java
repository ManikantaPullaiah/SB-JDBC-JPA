package com.common.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Accounts")
public class AccountEntity {
	@Id
	private Integer accountId;
	private String accountName;
	private Double balance;
	@Enumerated(EnumType.STRING)
	private AccountStatus status;
	@CreationTimestamp
	private LocalDateTime creationTime;
	@UpdateTimestamp
	private LocalDateTime updatioTime;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	public LocalDateTime getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}
	public LocalDateTime getUpdatioTime() {
		return updatioTime;
	}
	public void setUpdatioTime(LocalDateTime updatioTime) {
		this.updatioTime = updatioTime;
	}
	@Override
	public String toString() {
		return "AccountEntity [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance
				+ ", status=" + status + ", creationTime=" + creationTime + ", updatioTime=" + updatioTime + "]";
	}
	
	
	

}
