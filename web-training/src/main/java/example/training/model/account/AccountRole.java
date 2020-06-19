package example.training.model.account;

public enum AccountRole {
	ADMIN("管理者"),
	USER("ユーザー");

	private String label;

	private AccountRole(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


}
