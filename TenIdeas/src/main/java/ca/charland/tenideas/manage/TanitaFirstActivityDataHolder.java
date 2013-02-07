package ca.charland.tenideas.manage;

import ca.charland.activity.manage.FirstActivityDataHolder;

public class TanitaFirstActivityDataHolder extends FirstActivityDataHolder {

	@Override
	public Class<?> getNextAddClass() {
		return null; //AddANewPersonActivity.class;
	}

	@Override
	public Class<?> getNextViewClass() {
		return TenIdeasAllPeopleListActivity.class;
	}
}
