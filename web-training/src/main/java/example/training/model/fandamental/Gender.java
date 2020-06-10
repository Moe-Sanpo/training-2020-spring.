package example.training.model.fandamental;

import java.util.LinkedHashMap;
import java.util.Map;

public enum Gender {
	MALE("男性"),
	FEMALE("女性"),
	OTHER("その他");

	private String label;

	private Gender(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Map<String, String> options(){
		Map<String, String> option = new LinkedHashMap<String, String>();

		for(Gender gender : Gender.values())
		option.put(gender.name(), gender.getLabel());

		return option;
	}

}
