package org.mql.android.dao;

import java.util.Vector;

import org.apache.catalina.mapper.Mapper;
import org.bson.conversions.Bson;
import org.mql.android.jdbc.Database;
import org.mql.android.modele.Location;


public class LocationDaoDefault implements LocationDao {
	private Database db;

	public LocationDaoDefault(Database db) {
		this.db = db;
	}

	@Override
	public String[] getAll(String collectionName) {
		Vector<Location> locationsVect=new Vector<Location>();
		String[] data = db.find(collectionName);
		for (String locationVar : data) {
			
		}
		
		return data;
	}

	@Override
	public Location getOne(String collectionName, Bson filter) {
		return null;
	}

	@Override
	public void addLocation(String collectionName, Location location) {

	}

	public void setDb(Database db) {
		this.db = db;
	}

	public Database getDb() {
		return db;
	}

}
