package ca.charland.tenideas.manage;

import ca.charland.activity.manage.BaseDateListOfPreviousEntriesActivity;
import ca.charland.db.DateListDataSource;

public class DateListOfPreviousEntriesActivity extends BaseDateListOfPreviousEntriesActivity {

	@Override
	protected DateListDataSource getDateListDataSource() {
		return new DateListDataSource(null);
	}

	@Override
	protected Class<?> getPreviousEntryClass() {
		return SingleDateValuesEnteredActivity.class;
	}
}
