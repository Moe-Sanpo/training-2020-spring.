package helloworld.model.Music;

public class MusicId {
	private Integer value;

	public MusicId(Integer value) {
		super();
		this.value = value;
	}

	public MusicId() {
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
		return "MusicId [vslue=" + value + "]";
	}


}
