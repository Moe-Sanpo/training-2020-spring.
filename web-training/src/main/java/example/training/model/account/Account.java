package example.training.model.account;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -6751433478401371309L;

	private AccountId id;
	private AccountLoginId loginId;
	private AccountName name;
	private Password password;
	private AccountRole role;


	public Account(AccountId id, AccountLoginId loginId, AccountName name, Password password, AccountRole role) {
		this.id = id;
		this.loginId = loginId;
		this.name = name;
		this.password = password;
		this.role = role;
	}


	public Account() {
		this.id = new AccountId();
		this.loginId = new AccountLoginId();
		this.name = new AccountName();
		this.password = new Password();
		this.role = AccountRole.USER;
	}


	public AccountId getId() {
		return id;
	}
	public void setId(AccountId id) {
		this.id = id;
	}
	public AccountLoginId getLoginId() {
		return loginId;
	}
	public void setLoginId(AccountLoginId loginId) {
		this.loginId = loginId;
	}
	public AccountName getName() {
		return name;
	}
	public void setName(AccountName name) {
		this.name = name;
	}
	public Password getPassword() {
		return password;
	}
	public void setPassword(Password password) {
		this.password = password;
	}
	public AccountRole getRole() {
		return role;
	}
	public void setRole(AccountRole role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", loginId=" + loginId + ", name=" + name + ", password=" + password + ", role="
				+ role + "]";
	}

}