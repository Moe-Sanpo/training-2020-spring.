package helloworld.model.Music;

public class MusicName {

	private String value;

	public MusicName(String value) {
		super();
		this.value = value;
	}

	public MusicName() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MusicName [value=" + value + "]";
	}
	
	
}
