package ca.charland.tenideas;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class IdeasActivity extends RoboActivity {

	@InjectView(R.id.enter_idea)
	private TextView enter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ideas);
		setEnterText();
	}
	
	private void setEnterText() {
		Resources resources = getResources();
		String raw = resources.getString(R.string.enter_idea);
		enter.setText(String.format(raw, getNumberEntered()));
	}

	/**
	 * Override this method with new values potentially.
	 * @return
	 */
	private int getNumberEntered() {
		return 1;
	}
}
