package ca.charland.tenideas.manage;

import ca.charland.activity.DateAndTimeActivity;
import ca.charland.activity.manage.PersonHomeActivityDataHolder;

public class TenIdeasPersonHomeActivityDataHolder extends PersonHomeActivityDataHolder {

	@Override
	public Class<?> getNextAddClass() {
		return DateAndTimeActivity.class;
	}

	@Override
	public Class<?> getNextViewClass() {
		return TanitaDateListOfPreviousEntriesActivity.class;
	}

	@Override
	protected Class<?> getNextClass() {
		return TenIdeasAllPeopleListActivity.class;
	}
}
