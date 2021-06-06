package org.mql.android.web.controller.actions;

import org.mql.android.business.LocationService;
import org.mql.android.business.LocationServiceDefault;
import org.mql.android.dao.LocationDao;
import org.mql.android.dao.LocationDaoDefault;
import org.mql.android.jdbc.Database;

public class LocalActionFactory extends ActionFactory {
	private LocationAction locationAction;

	public LocalActionFactory(String source) {
		Database db = new Database("GuideTouristique");
		LocationDao locationDao = new LocationDaoDefault(db);
		LocationService service = new LocationServiceDefault(locationDao);
		locationAction = new LocationAction(service);
	}

	@Override
	public LocationAction getLocationAction() {
		return locationAction;
	}

}
