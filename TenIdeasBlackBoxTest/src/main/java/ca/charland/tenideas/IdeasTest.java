package ca.charland.tenideas;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

public class IdeasTest extends ActivityInstrumentationTestCase2<IdeasActivity>{

	private Solo solo;

	public IdeasTest() {
		super("ca.charland.tenideas", IdeasActivity.class);
	}
	
	@Override
	public void setUp() throws Exception {
		//setUp() is run before a test case is started. 
		//This is where the solo object is created.
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	@Override
	public void tearDown() throws Exception {
		//tearDown() is run after a test case has finished. 
		//finishOpenedActivities() will finish all the activities that have been opened during the test execution.
		solo.finishOpenedActivities();
	}
	
	public void testOpenAddANewPerson() throws Exception {
		solo.typeText(0, "bla bla");
		solo.clickOnButton("next");
	}
}
