package ca.charland.tenideas.manage;

import ca.charland.activity.manage.BaseFirstActivityDataHolder;

public class FirstActivityDataHolder extends BaseFirstActivityDataHolder {

	@Override
	public Class<?> getNextViewClass() {
		return AllPeopleListActivity.class;
	}
}
