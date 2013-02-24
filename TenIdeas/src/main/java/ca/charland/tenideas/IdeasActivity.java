package ca.charland.tenideas;

import android.os.Bundle;
import roboguice.activity.RoboActivity;

public class IdeasActivity extends RoboActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ideas);
	}
}
