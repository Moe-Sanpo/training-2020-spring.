package example.training.datasource.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.account.Account;
import example.training.model.account.AccountRepositry;

@Repository
public class AccountDataSource implements AccountRepositry {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public Account findByAccountId(String login_id) {
		return accountMapper.findByAccountId(login_id);
	}


}
