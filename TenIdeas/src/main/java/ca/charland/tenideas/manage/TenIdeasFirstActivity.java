package ca.charland.tenideas.manage;

import ca.charland.activity.manage.FirstActivity;
import ca.charland.activity.manage.FirstActivityDataHolder;
import ca.charland.activity.manage.PersonHomeActivityDataHolder;

public class TenIdeasFirstActivity extends FirstActivity {

	@Override
	protected PersonHomeActivityDataHolder getSingleUserModeDataHolder() {
		return null;
	}

	@Override
	protected FirstActivityDataHolder getMultipleUserModeDataHolder() {
		return new FirstActivityDataHolder();
	}
}
