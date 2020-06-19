package example.training.datasource.account;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import example.training.model.account.Account;

@Mapper
public interface AccountMapper {
	public Account findByAccountId(@Param("login_Id") String login_id);
}
