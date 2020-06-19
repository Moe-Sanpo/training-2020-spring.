package example.training.model.account;

import java.io.Serializable;

public class AccountLoginId implements Serializable {

	private static final long serialVersionUID = -4430428357068882181L;

	private String value;

	public AccountLoginId(String value) {
		super();
		this.value = value;
	}

	public AccountLoginId() {
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
		return "AccountLoginId [value=" + value + "]";
	}



}
