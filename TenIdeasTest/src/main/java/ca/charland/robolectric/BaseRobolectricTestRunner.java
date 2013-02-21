package ca.charland.robolectric;

import java.io.File;

import org.junit.runners.model.InitializationError;

import roboguice.RoboGuice;
import roboguice.activity.RoboActivity;
import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.google.inject.Injector;
import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import com.xtremelabs.robolectric.shadows.ShadowActivity;
import com.xtremelabs.robolectric.shadows.ShadowResources;

/**
 * Custom runner to redirect to the development folder. Specifically so the res and manifest can be found.
 * 
 * @author mcharland
 * 
 */
public class BaseRobolectricTestRunner extends RobolectricTestRunner {

	private Injector injector;

	public BaseRobolectricTestRunner(Class<?> testClass) throws InitializationError {
		this(testClass, ".." + File.separator + "TenIdeas");
	}

	public BaseRobolectricTestRunner(Class<?> testClass, String configFile) throws InitializationError {
		super(testClass, new File(configFile));
	}

	@Override
	public void prepareTest(Object test) {
		Context context = new RoboActivity();
		this.injector = RoboGuice.getInjector(context);
		this.injector.injectMembers(test);
	}

	@Override
	protected void bindShadowClasses() {
		Robolectric.bindShadowClass(ShadowResources.class);
	}

	public static View getViewFromShadowActivity(Activity activity, int id) {
		ShadowActivity shadowA = Robolectric.shadowOf(activity);
		View next = (View) shadowA.findViewById(id);
		return next;
	}
}
