package example.training.model.account;

import java.io.Serializable;

public class AccountId implements Serializable {

	private static final long serialVersionUID = -8187916926956300809L;

	private String value;

	public AccountId(String value) {
		this.value = value;
	}

	public AccountId() {

	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AccountId [value=" + value + "]";
	}

}
