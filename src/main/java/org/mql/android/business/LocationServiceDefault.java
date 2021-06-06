package org.mql.android.business;

import org.bson.conversions.Bson;
import org.mql.android.dao.LocationDao;
import org.mql.android.modele.Location;


public class LocationServiceDefault implements LocationService {
	private LocationDao locationdao;

	public LocationServiceDefault(LocationDao locationDao) {
		this.locationdao = locationDao;
	}

	@Override
	public String[] getAll(String collectionName) {
		return locationdao.getAll(collectionName);
	}

	@Override
	public Location getOne(String collectionName, Bson filter) {
		return locationdao.getOne(collectionName, filter);
	}

	@Override
	public void addLocation(String collectionName, Location location) {
		locationdao.addLocation(collectionName, location);
	}

}