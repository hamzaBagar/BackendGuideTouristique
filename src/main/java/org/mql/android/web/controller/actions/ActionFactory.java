package org.mql.android.web.controller.actions;

abstract public class ActionFactory {
	abstract public LocationAction getLocationAction();


	public static ActionFactory getDefaultActionFactory(String source) {
		return new LocalActionFactory(source);
	}
}
