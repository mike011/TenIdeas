package ca.charland.tenideas.manage;

import ca.charland.activity.manage.BaseDateListOfPreviousEntriesActivity;
import ca.charland.db.BasicPersonDataTable;
import ca.charland.db.DatabaseConnection;
import ca.charland.db.DateListDataSource;

public class DateListOfPreviousEntriesActivity extends BaseDateListOfPreviousEntriesActivity {

	@Override
	protected DateListDataSource getDateListDataSource() {
		return new DateListDataSource(new DatabaseConnection(this, DatabaseConnection.DATABASE_NAME, BasicPersonDataTable.TABLE_NAME, BasicPersonDataTable.CREATE_PEOPLE_TABLE));
	}

	@Override
	protected Class<?> getPreviousEntryClass() {
		return SingleDateValuesEnteredActivity.class;
	}
}
