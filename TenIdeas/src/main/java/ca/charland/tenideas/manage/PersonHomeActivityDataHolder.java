package ca.charland.tenideas.manage;

import ca.charland.activity.manage.BasePersonHomeActivityDataHolder;
import ca.charland.tenideas.DateAndTimeActivity;

public class PersonHomeActivityDataHolder extends BasePersonHomeActivityDataHolder {

	@Override
	public Class<?> getNextAddClass() {
		return DateAndTimeActivity.class;
	}

	@Override
	public Class<?> getNextViewClass() {
		return DateListOfPreviousEntriesActivity.class;
	}

	@Override
	protected Class<?> getNextClass() {
		return AllPeopleListActivity.class;
	}
}
