package course.labs.activitylab;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends Activity {

	private static final String RESTART_KEY = "restart";
	private static final String RESUME_KEY = "resume";
	private static final String START_KEY = "start";
	private static final String CREATE_KEY = "create";

	// String for LogCat documentation
	private final static String TAG = "Lab-ActivityTwo";

	// Lifecycle counters

	// TODO:
	// Create counter variables for onCreate(), onRestart(), onStart() and
	// onResume(), called mCreate, etc.
	// You will need to increment these variables' values when their
	// corresponding lifecycle methods get called
    private int m_createCounter;
    private int m_restartCounter;
    private int m_startCounter;
    private int m_resumeCounter;



	// TODO: Create variables for each of the TextViews, called
        // mTvCreate, etc. 
    TextView m_createLabel;
    TextView m_restartLabel;
    TextView m_resumeLabel;
    TextView m_startLabel;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);

		// TODO: Assign the appropriate TextViews to the TextView variables
		// Hint: Access the TextView by calling Activity's findViewById()
		// textView1 = (TextView) findViewById(R.id.textView1);
        m_createLabel = (TextView) findViewById( R.id.create );
        m_restartLabel = (TextView) findViewById( R.id.restart );
        m_resumeLabel = (TextView) findViewById( R.id.resume );
        m_startLabel = (TextView) findViewById( R.id.start );




		Button closeButton = (Button) findViewById(R.id.bClose); 
		closeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				// TODO:
				// This function closes Activity Two
				// Hint: use Context's finish() method
            ActivityTwo.this.finish();

			
			}
		});

		// Check for previously saved state
		if (savedInstanceState != null) {

			// TODO:
			// Restore value of counters from saved state
			// Only need 4 lines of code, one for every count variable



		}

		// TODO: Emit LogCat message



		// TODO:
		// Update the appropriate count variable
		// Update the user interface via the displayCounts() method




	}

	// Lifecycle callback methods overrides

	@Override
	public void onStart() {
		super.onStart();

		// TODO: Emit LogCat message


		// TODO:
		// Update the appropriate count variable
		// Update the user interface



	}

	@Override
	public void onResume() {
		super.onResume();

		// TODO: Emit LogCat message


		// TODO:
		// Update the appropriate count variable
		// Update the user interface




	}

	@Override
	public void onPause() {
		super.onPause();

		// TODO: Emit LogCat message



	}

	@Override
	public void onStop() {
		super.onStop();

		// TODO: Emit LogCat message



	}

	@Override
	public void onRestart() {
		super.onRestart();

		// TODO: Emit LogCat message


		// TODO:
		// Update the appropriate count variable
		// Update the user interface



	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		// TODO: Emit LogCat message

	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {

		// TODO:
		// Save counter state information with a collection of key-value pairs
		// 4 lines of code, one for every count variable





	
	}

	// Updates the displayed counters
	public void displayCounts() {

        m_createLabel.setText("onCreate() calls: " + m_createCounter);
        m_startLabel.setText("onStart() calls: " + m_startLabel);
        m_resumeLabel.setText("onResume() calls: " + m_resumeLabel);
        m_restartLabel.setText("onRestart() calls: " + m_restartLabel);
	
	}
}
