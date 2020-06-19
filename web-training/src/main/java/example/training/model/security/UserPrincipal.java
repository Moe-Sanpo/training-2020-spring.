package example.training.model.security;


import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import example.training.model.account.Account;
import example.training.model.account.AccountId;
import example.training.model.account.AccountName;


public class UserPrincipal extends User {

	private static final long serialVersionUID = 7584340983050784475L;

	private AccountId id;
	private AccountName name;

	public UserPrincipal(Account account) {
        super(account.getLoginId().getValue(),
                account.getPassword().getValue(),
                AuthorityUtils.createAuthorityList("ROLE_" + account.getRole().name()));
        this.id = account.getId();
        this.name = account.getName();
    }

	public AccountId getId() {
		return id;
	}

	public void setId(AccountId id) {
		this.id = id;
	}

	public AccountName getName() {
		return name;
	}

	public void setName(AccountName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserPrincipal [id=" + id + ", name=" + name + "]";
	}





}
