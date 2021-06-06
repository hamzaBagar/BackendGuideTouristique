package org.mql.android.business;

import org.bson.conversions.Bson;
import org.mql.android.dao.LocationDao;
import org.mql.android.modele.Location;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/Location")
public class LocationServiceDefault implements LocationService {
	private LocationDao locationdao;

	public LocationServiceDefault(LocationDao locationDao) {
		this.locationdao = locationDao;
	}

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String[] getAll(String collectionName) {
		return locationdao.getAll(collectionName);
	}

	@GET
	@Path("/getOne/{filter}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Location getOne(String collectionName, @PathParam("filter") Bson filter) {
		return locationdao.getOne(collectionName, filter);
	}

	@PUT
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public void addLocation(String collectionName, Location location) {
		locationdao.addLocation(collectionName, location);
	}

}