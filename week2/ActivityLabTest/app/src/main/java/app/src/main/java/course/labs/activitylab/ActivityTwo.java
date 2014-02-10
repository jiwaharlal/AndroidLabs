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
            m_createCounter = savedInstanceState.getInt( CREATE_KEY );
            m_restartCounter = savedInstanceState.getInt( RESTART_KEY );
            m_resumeCounter = savedInstanceState.getInt( RESUME_KEY );
            m_startCounter = savedInstanceState.getInt( START_KEY );
		}

		// TODO: Emit LogCat message
        Log.i( TAG, "Entered onCreate() method" );
		// TODO:
		// Update the appropriate count variable
		// Update the user interface via the displayCounts() method
        m_createCounter++;
        displayCounts();
	}

	// Lifecycle callback methods overrides

	@Override
	public void onStart() {
		super.onStart();

		// TODO: Emit LogCat message
        Log.i( TAG, "Entered onStart() method" );
		// TODO:
		// Update the appropriate count variable
		// Update the user interface
        m_startCounter++;
        displayCounts();
	}

	@Override
	public void onResume() {
		super.onResume();

		// TODO: Emit LogCat message
        Log.i( TAG, "Entered onResume() method" );
		// TODO:
		// Update the appropriate count variable
		// Update the user interface
        m_resumeCounter++;
        displayCounts();
	}

	@Override
	public void onPause() {
		super.onPause();

		// TODO: Emit LogCat message
        Log.i( TAG, "Entered onPause() method" );
	}

	@Override
	public void onStop() {
		super.onStop();

		// TODO: Emit LogCat message
        Log.i( TAG, "Entered onStop() method" );
	}

	@Override
	public void onRestart() {
		super.onRestart();

		// TODO: Emit LogCat message
        Log.i( TAG, "Entered onRestart() method" );
		// TODO:
		// Update the appropriate count variable
		// Update the user interface
        m_restartCounter++;
        displayCounts();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		// TODO: Emit LogCat message
        Log.i( TAG, "Entered the onDestroy() method" );
	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
		// TODO:
		// Save counter state information with a collection of key-value pairs
		// 4 lines of code, one for every count variable
        savedInstanceState.putInt( CREATE_KEY, m_createCounter );
        savedInstanceState.putInt( START_KEY, m_startCounter );
        savedInstanceState.putInt( RESUME_KEY, m_resumeCounter );
        savedInstanceState.putInt( RESTART_KEY, m_restartCounter );
	}

	// Updates the displayed counters
	public void displayCounts() {

        m_createLabel.setText("onCreate() calls: " + m_createCounter);
        m_startLabel.setText("onStart() calls: " + m_startCounter);
        m_resumeLabel.setText("onResume() calls: " + m_resumeCounter);
        m_restartLabel.setText("onRestart() calls: " + m_restartCounter);
	
	}
}
