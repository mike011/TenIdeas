package ca.charland.tenideas.TenIdeas;

import com.google.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloAndroidActivity extends RoboActivity {

	@InjectView(R.id.name)
	TextView name;
	
	@InjectView(R.id.thumbnail)
	ImageView thumbnail;

	@InjectResource(R.drawable.icon)
	Drawable icon;

	@InjectResource(R.string.app_name)
	String myName;
	
	@Inject	
	LocationManager loc;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		name.setText("Hello, " + myName);
	}

}
