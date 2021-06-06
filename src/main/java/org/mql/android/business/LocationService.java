package org.mql.android.business;

import org.bson.conversions.Bson;
import org.mql.android.modele.Location;

public interface LocationService {
	public String[] getAll(String collectionName);

	public Location getOne(String collectionName, Bson filter);

	public void addLocation(String collectionName, Location location);
}
