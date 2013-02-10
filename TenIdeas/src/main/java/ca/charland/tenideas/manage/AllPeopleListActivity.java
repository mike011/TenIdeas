package ca.charland.tenideas.manage;

import ca.charland.activity.manage.BaseAllPeopleListActivity;
import ca.charland.db.AbstractPersonDataSource;
import ca.charland.db.BasicPersonDataSource;

public class AllPeopleListActivity extends BaseAllPeopleListActivity {

	@Override
	protected Class<?> getFirstClass() {
		return FirstActivity.class;
	}

	@Override
	protected AbstractPersonDataSource getPersonDataSource() {
		return new BasicPersonDataSource(this);
	}

	@Override
	protected Class<?> getHomeActivity() {
		return PersonHomeActivity.class;
	}
}
