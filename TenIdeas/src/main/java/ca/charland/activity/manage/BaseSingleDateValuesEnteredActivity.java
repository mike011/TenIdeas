package ca.charland.activity.manage;

import roboguice.activity.RoboActivity;
import android.os.Bundle;
import ca.charland.tenideas.R;

/**
 * Shows the data entered for a specific date.
 * 
 * @author mcharland.
 */
public abstract class BaseSingleDateValuesEnteredActivity extends RoboActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.person_date);
	}
}
