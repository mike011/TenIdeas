package ca.charland.tenideas.manage;

import ca.charland.activity.manage.BaseAllPeopleListActivity;

public class AllPeopleListActivity extends BaseAllPeopleListActivity {

	@Override
	protected Class<?> getFirstClass() {
		return FirstActivity.class;
	}

	@Override
	protected Class<?> getHomeActivity() {
		return PersonHomeActivity.class;
	}
}
