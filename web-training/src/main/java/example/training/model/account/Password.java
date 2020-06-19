package example.training.model.account;

import java.io.Serializable;

public class Password implements Serializable{

	private static final long serialVersionUID = 8396744927350001699L;

	private String value;

	public Password(String value) {
		this.value = value;
	}

	public Password() {
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
		return "AccountPassword [value=" + value + "]";
	}


}
