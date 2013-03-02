package ca.charland.tenideas;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class IdeasActivity extends RoboActivity {

	private static final String ID = "ID";

	@InjectView(R.id.enter_idea)
	private TextView enter;

	@InjectView(R.id.next)
	private Button next;
	
	private int id;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ideas);
		setEnterText();
		setUpNextButton();
		setupID();
	}

	private void setEnterText() {
		Resources resources = getResources();
		String raw = resources.getString(R.string.enter_idea);
		enter.setText(String.format(raw, getNumberEntered()));
	}

	private void setUpNextButton() {
		next.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(getNextIntent());
			}
		});
	}

	private void setupID() {
		id = getID();
		
		// base case
		if(id == -1) {
			id = 1;
		}
	}
	
	private int getID() {
		int id = -1;
		Intent intent = getIntent();
		if (intent != null) {
			// Don't know how inject extras in testing.
			return getIDFromExtras(intent);
		}
		return id;
	}
	
	private int getIDFromExtras(Intent intent) {
		int id = -1;
		Bundle extras = intent.getExtras();
		if(extras == null) {
			throw new ExtrasNotSetException();
		}
		if (extras.containsKey(ID)) {
			return extras.getInt(ID);
		}
		return id;
	}

	private Intent getNextIntent() {
		Intent newIntent = new Intent(getBaseContext(), getClass());
		newIntent.putExtra(ID, id);
		return newIntent;
	}

	/**
	 * Override this method with new values potentially.
	 * 
	 * @return
	 */
	private int getNumberEntered() {
		return id;
	}
}
