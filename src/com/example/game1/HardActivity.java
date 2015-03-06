package com.example.game1;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;

public class HardActivity extends Activity {
	int i;
	 ImageButton[] imageButtons = new ImageButton[12]  ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hard);
		for(i=0; i<12; i++) {
			ImageButton[] imageButton = null;
			imageButton[i] = (ImageButton)findViewById(getResources().getIdentifier
					("image" + i, "id", getPackageName()));
			imageButton[i].setImageResource(R.drawable.hold);
		}
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hard, menu);
		return true;
	}

}
