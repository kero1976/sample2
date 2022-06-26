package domain2;

public class Entity {

	private String name;

	public String getName() {
		if(name == null) {
			return "";
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
