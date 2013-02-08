package ca.charland.tenideas;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TenIdeas extends RoboActivity {

	@InjectView(R.id.add)
	private Button add;

	@InjectView(R.id.view)
	private Button view;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		add.setOnClickListener(getViewOnClickListenerForAdd());
		view.setOnClickListener(getViewOnCickListenerForView());
	}
	
	private OnClickListener getViewOnCickListenerForView() {
		return new View.OnClickListener() {
			public void onClick(View v) {
//				Intent intent = new Intent(getBaseContext(), DateListActivity.class);
//				Bundle extras = getIntent().getExtras();
//				intent.putExtra(PeopleListActivity.PERSON_ID, extras.getInt(PeopleListActivity.PERSON_ID));
//				startActivity(intent);
			}
		};
	}

	private OnClickListener getViewOnClickListenerForAdd() {
		return new View.OnClickListener() {
			public void onClick(View v) {
//				Intent intent = new Intent(getBaseContext(), DateAndTimeActivity.class);
//				Bundle extras = getIntent().getExtras();
//				intent.putExtra(PeopleListActivity.PERSON_ID, extras.getInt(PeopleListActivity.PERSON_ID));
//				startActivity(intent);
			}
		};
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// replaces the default 'Back' button action
		if (keyCode == KeyEvent.KEYCODE_BACK) {
//			Intent intent = new Intent(this, PeopleListActivity.class);
//			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
//			
//            startActivity(intent);
//			finish();
		}
		return true;
	}
}

