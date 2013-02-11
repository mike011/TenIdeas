package ca.charland.tenideas;

import ca.charland.activity.BaseDateAndTimeActivity;
import ca.charland.activity.NextButtonOnClickListener;

public class DateAndTimeActivity extends BaseDateAndTimeActivity {

	@Override
	protected NextButtonOnClickListener getNextButtonOnClickListener() {
		return new NextButtonOnClickListener(this, datasource);
	}

	@Override
	public Class<?> getNextClass() {
		return IdeasActivity.class;
	}
}
