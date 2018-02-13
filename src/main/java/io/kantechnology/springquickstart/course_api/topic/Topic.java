package io.kantechnology.springquickstart.course_api.topic;

public class Topic {
	
	private String id;
	private String Discription;
	private String Name;
	
	
	public Topic() {
		
	}
	public Topic(String id, String name, String discription) {
		super();
		this.id = id;
		Name = name;
		Discription = discription;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
}
