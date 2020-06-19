package example.training.service.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import example.training.model.account.Account;
import example.training.model.account.AccountRepositry;
import example.training.model.security.UserPrincipal;

public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	AccountRepositry accountRepositry;

	@Override
	public UserDetails loadUserByUsername(String login_id) throws UsernameNotFoundException {
		Account account = accountRepositry.findByAccountId(login_id);
		if(account == null) {
			throw new UsernameNotFoundException("");
		}
		return new UserPrincipal(account);
	}


}
