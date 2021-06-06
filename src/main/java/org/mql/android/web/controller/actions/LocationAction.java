package org.mql.android.web.controller.actions;

import org.mql.android.business.LocationService;

public class LocationAction {
	private LocationService service;
	private String[] data;

	public LocationAction() {
	}

	public LocationAction(LocationService service) {
		this.service = service;
	}

	public void setService(LocationService service) {
		this.service = service;
	}

	public String[] getAllLocations(String collectionName) {
		data = service.getAll(collectionName);
		return data;
	}
}
