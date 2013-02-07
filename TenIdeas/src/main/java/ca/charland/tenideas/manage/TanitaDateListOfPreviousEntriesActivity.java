package ca.charland.tenideas.manage;

import ca.charland.activity.manage.DateListOfPreviousEntriesActivity;
import ca.charland.db.DateListDataSource;

public class TanitaDateListOfPreviousEntriesActivity extends DateListOfPreviousEntriesActivity {

	@Override
	protected DateListDataSource getDateListDataSource() {
		return new DateListDataSource(null);
	}

	@Override
	protected Class<?> getPreviousEntryClass() {
		return TendIdeasSingleDateValuesEnteredActivity.class;
	}
}
