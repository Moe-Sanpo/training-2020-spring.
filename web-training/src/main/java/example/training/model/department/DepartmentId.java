package example.training.model.department;

public class DepartmentId {
	private Integer value;

	public DepartmentId(Integer value) {
		super();
		this.value = value;
	}

	public DepartmentId() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DepartmentId [value=%s]", value);
	}


}
