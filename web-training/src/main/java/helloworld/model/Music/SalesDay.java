package helloworld.model.Music;

import java.time.LocalDate;

public class SalesDay {
	private LocalDate day;

	public SalesDay(LocalDate day) {
		super();
		this.day = day;
	}

	public SalesDay() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "SalesDay [day=" + day + "]";
	}


}
