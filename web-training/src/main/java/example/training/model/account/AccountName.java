package example.training.model.account;

import java.io.Serializable;

public class AccountName implements Serializable {

	private static final long serialVersionUID = 1061554217895805813L;

	private String value;

	public AccountName(String value) {
		this.value = value;
	}

	public AccountName() {
		this.value = "";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AccountName [value=" + value + "]";
	}

}
