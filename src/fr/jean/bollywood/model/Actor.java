package fr.jean.bollywood.model;

public class Actor {
	String Name;
	String imageUri;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public Actor(String name, String imageUri) {
		super();
		Name = name;
		this.imageUri = imageUri;
	}
	
	

}
