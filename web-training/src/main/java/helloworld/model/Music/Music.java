package helloworld.model.Music;

public class Music {
	private MusicName name;
	private SalesDay day;
	private MusicId id;

	public Music(MusicName name, SalesDay day,MusicId id) {
		super();
		this.name = name;
		this.day = day;
		this.id = id;

	}

	public Music() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public MusicName getName() {
		return name;
	}

	public SalesDay getDay() {
		return day;
	}

	public MusicId getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Music [name=" + name + ", day=" + day + ", id=" + id + "]";
	}



}
