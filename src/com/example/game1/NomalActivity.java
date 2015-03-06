package com.example.game1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NomalActivity extends Activity {
	private ImageView bu1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nomal);
		bu1 = (ImageButton) findViewById(R.id.bu1);
		bu1.setImageResource(R.drawable.hold2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nomal, menu);
		return true;
	}

}
