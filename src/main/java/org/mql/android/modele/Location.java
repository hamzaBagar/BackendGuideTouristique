package org.mql.android.modele;

import org.bson.types.ObjectId;

public class Location {
	private ObjectId id;
	private String cityName;
	private String description;
	private String picture;

	public Location() {
	}

	public Location(ObjectId id, String cityName, String description, String picture) {
		this.id = id;
		this.cityName = cityName;
		this.description = description;
		this.picture = picture;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName.toUpperCase();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
